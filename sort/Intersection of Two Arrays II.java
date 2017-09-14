class solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int flag1 = 0;
        int flag2 = 0;
        ArrayList<Integer> lst = new ArrayList<Integer> ();
        while ((flag1 < nums1.length) && (flag2 < nums2.length)) {
            if (nums1[flag1] < nums2[flag2]) {
                flag1++;
            } else if (nums1[flag1] > nums2[flag2]) {
                flag2++;
            } else {
                lst.add(nums1[flag1]);
                flag1++;
                flag2++;
            }
        }
        int[] res = new int[myList.size()];
        for(int i = 0; i<res.length; i++){
            res[i] = (Integer)myList.get(i);
        }
        return res;
    }
}
