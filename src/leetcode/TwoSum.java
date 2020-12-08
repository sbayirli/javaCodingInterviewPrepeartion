package leetcode;

import java.util.Hashtable;
/* 
 * leetcode 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 * */

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null) return null;
        if(nums.length<2) return null;
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        
        for(int i=0; i<nums.length; i++){
            if(ht.get(nums[i])!=null){
                result[0] = ht.get(nums[i]);
                result[1] = i;
                break;
            }else{
               ht.put(target-nums[i],i);
            }
        }
        return result;
    }
}
