/** 
gfg link - https://practice.geeksforgeeks.org/problems/zero-sum-subarrays1825/1

You are given an array arr[] of size n. Find the total count 
of sub-arrays having their sum equal to 0.

Input:
n = 6
arr[] = {0,0,5,5,0,0}
Output: 6
Explanation: The 6 subarrays are 
[0], [0], [0], [0], [0,0], and [0,0].

**/

//brute force ON^2
const subarr = (arr) => {
  let count = 0;
  for (let i = 0; i < n; i++) {
    let sum = 0;
    for (let j = i; j < n; j++) {
      sum = sum + arr[j];
      if (sum === 0) {
        count++;
      }
    }
  }
  return count;
};

//prefix sum =>
//takes O(N) space and O(N) time
/**
 * 

 */
const optimalSubarr = (arr) => {
  let mp = new Map();
  let sum = 0;
  let counter = 0;

  //iterating over the array.
  for (let i = 0; i < n; i++) {
    //storing prefix sum.
    sum = sum + arr[i];

    //if prefix sum is zero that means we get a subarray with sum=0.
    if (sum == 0) {
      //incrementing the counter.
      counter++;
    }

    //if prefix sum is already present in map then it is repeated
    //which means there is a subarray whose summation is 0.
    if (mp.has(sum)) {
      //we add the value at prefix sum in map to counter.
      counter += mp.get(sum);
    }

    //incrementing the count of prefix sum obtained in map.
    if (!mp.has(sum)) mp.set(sum, 1);
    else mp.set(sum, mp.get(sum) + 1);
  }
  //returning the counter.
  return counter;
};
