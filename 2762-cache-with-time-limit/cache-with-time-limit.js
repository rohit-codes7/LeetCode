var TimeLimitedCache = function() {

    this.cache = new Map();
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {

    const existing = this.cache.get(key);
    const isActive = existing !== undefined;

    // If key exists, clear the existing timeout
    if (isActive) clearTimeout(existing.timeout);

    // Schedule a new timeout to delete the key when duration elapses
    const timeout = setTimeout(() => {
        this.cache.delete(key);
    }, duration);

    // Store value and the associated timeout reference
    this.cache.set(key, { value, timeout });

    return isActive;
};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {

    const entry = this.cache.get(key);
    return entry ? entry.value : -1;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {

        return this.cache.size;
};
/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */