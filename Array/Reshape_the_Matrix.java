class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null) return nums;
        int rows = nums.length;
        int cols = nums[0].length;
        int[][] new_nums = new int[r][c];
        if (r*c != rows*cols) return nums;
        int r_i = 0;
        int c_i = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (c_i < c) {
                    new_nums[r_i][c_i] = nums[i][j];
                    c_i++;
                } else {
                    c_i = 0;
                    r_i++;
                    new_nums[r_i][c_i] = nums[i][j];
                    c_i++;
                }
            } 
        }
        return new_nums;
    }
}
