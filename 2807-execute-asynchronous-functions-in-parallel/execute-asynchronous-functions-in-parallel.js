/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
function promiseAll(functions) {
  return new Promise((resolve, reject) => {
    const results = [];
    let completed = 0;

    functions.forEach((fn, index) => {
      // Call each function to start its promise
      fn()
        .then(result => {
          results[index] = result;  // Store result in the correct order
          completed++;

          // If all have completed, resolve the final promise
          if (completed === functions.length) {
            resolve(results);
          }
        })
        .catch(error => {
          // If any one fails, reject immediately
          reject(error);
        });
    });

    // Handle empty array case
    if (functions.length === 0) {
      resolve([]);
    }
  });
}


/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */