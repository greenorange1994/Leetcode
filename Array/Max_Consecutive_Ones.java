class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> record = new ArrayList<> ();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                record.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        record.add(count);
        return Collections.max(record);
    }
} 
