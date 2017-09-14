class Solution {
    private int[] toInt(Set<Integer> set) {
        int[] a = new int[set.size()];
        int i = 0;
        for (Integer val : set) a[i++] = val;
        return a;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> h = new HashSet();
        int a = nums1.length;
        int b = nums2.length;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (nums2[j] == nums1[i]) {
                    h.add(nums1[i]);
                    break;
                }
            }
        }
        return toInt(h);
    }
}
