package sumit.datastructures.arrays_hashing;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //Sorting TC:[O(n logn)]  SC:[O(n) OR O(1)]
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;

    }
   //Hash Set TC:[O(n)]  SC:[O(n)]
    public boolean hasDuplicate2(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    //Hash Set Length TC:[O(n logn)]  SC:[O(n)]
    public boolean hasDuplicate3(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
