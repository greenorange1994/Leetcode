import java.lang.*;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1; 
            if(nums[index] > 0) nums[index] = -nums[index];
            else if(nums[index] < 0) res.add(index + 1);
        }
        return res;
    }
}
