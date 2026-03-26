class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];
        System.arraycopy(nums1,0,merged,0,m);
        System.arraycopy(nums2,0,merged,m,n);
        Arrays.sort(merged);
        System.arraycopy(merged,0,nums1,0,m+n);
    }
}