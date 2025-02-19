package sumit.datastructures.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }
    public int[] twoSumHM(int[] nums, int target) {
        Map<Integer,Integer> sum = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int diff = target -num;

            if(sum.containsKey(diff)){
                return new int [] {sum.get(diff),i};
            }
            sum.put(num,i);
        }
        return new int [] {};
    }
}
