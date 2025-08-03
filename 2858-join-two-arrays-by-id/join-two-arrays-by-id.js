/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    const obj = {}
    arr1.forEach(val=> obj[val.id] = val)
    arr2.forEach(val=> obj[val.id] = {...(obj[val.id]??{}),...val})
    return Object.values(obj);
};