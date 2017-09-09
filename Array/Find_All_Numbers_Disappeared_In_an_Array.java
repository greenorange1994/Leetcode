class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1; 
            if(nums[index] > 0) nums[index] = -nums[index];
            else continue;
        }
        
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] > 0) res.add(j+1);
        }
        return res;  
    }
}
