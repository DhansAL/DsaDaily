// gfg link - https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
/**
  * problem - 
Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.

Example - 
Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
*/

/**
 *
 * @param {array} a, input array
 * @param {integer} size , size of the array
 * @returns {1 | -1}
 */

const majorityElement = (a, size) => {
  const coeff = Math.floor(a.length / 2); // majority coeff
  let majorityFreq = 0;
  let majorityElm = 0;

  /* freq{ 
  key - array elm : value - times it repeated
  }
 */
  const freq = {};
  for (let i = 0; i < a.length; i++) {
    let no = a[i];
    freq[no] = (freq[no] || 0) + 1;
  }
  //converting obj to arr for iterating
  let keyValueArr = Object.keys(freq).map((key) => [Number(key), freq[key]]);

  //iterate over converted array and find the no who has freq>coeff
  for (let i = 0; i < keyValueArr.length; i++) {
    if (keyValueArr[i][1] > majorityFreq) {
      majorityFreq = keyValueArr[i][1]; //freq or val of key
      if (majorityFreq > coeff) {
        // we dont change majorityElm until we get freq > coeff
        majorityElm = keyValueArr[i][0]; //key
      }
    }
  }
  return majorityElm > coeff ? majorityElm : -1;
};

// error- failed some test case
// reason - unknown
