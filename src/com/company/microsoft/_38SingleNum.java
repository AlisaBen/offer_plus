package com.company.microsoft;

/***
 * [3,3,1,3]只出现一次的数字
 */
class _38SingleNum {
    public static int singleNumber(int[] nums) {
      int seenOnce = 0, seenTwice = 0;
  
      for (int num : nums) {
        // first appearence: 
        // add num to seen_once 
        // don't add to seen_twice because of presence in seen_once
  
        // second appearance: 
        // remove num from seen_once 
        // add num to seen_twice
  
        // third appearance: 
        // don't add to seen_once because of presence in seen_twice
        // remove num from seen_twice
        // 与和非的优先级，非>与
        System.out.println("---");
        seenOnce = ~seenTwice & (seenOnce ^ num);
        System.out.println(seenOnce);
        seenTwice = ~seenOnce & (seenTwice ^ num);
        System.out.println(seenTwice);
      }
  
      return seenOnce;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,3,1,3};
        int s = singleNumber(nums);
        System.out.print(s);
    }
  }
