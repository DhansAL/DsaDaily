/**
 * gfg link - https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1
 *
 * Example 1:
 * Input:
 * n = 6
 * a[] = {5,5,10,100,10,5}
 * Output: 110
 * Explanation: 5+100+5=110
 */

/**
 * @param {array} a, input array
 * @param {integer} size , size of the array
 * @returns {interger} ans, the max amount the thief can steal
 */

const findMax = (arr, n) => {
  //Base cases
  if (n == 1) return arr[0];
  if (n == 2) return Math.max(arr[0], arr[1]);

  // including and excluding tree explanation -
  // https://www.youtube.com/watch?v=VT4bZV24QNo

  //initial includes and excludes
  let inc = arr[0];
  let exc = 0;

  for (let i = 1; i < n; i++) {
    let nInc = exc + arr[i];
    let nExc = Math.max(inc, exc);

    inc = nInc;
    exc = nExc;
  }

  // return the max of final inc and exc
  let ans = Math.max(inc, exc);
  return ans;
};

/*
 result - passed
 !!  - didn't worked on gfg but runs well
 gfg output at the time of this commit - 51010
 */
