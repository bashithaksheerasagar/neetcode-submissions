class Solution {
    public int binarySearch(int l, int r, int[] nums, int k) {
        if(l>r) return -1;
        int m = l+(r-l)/2;
        if(nums[m]==k) return m;
        else if(nums[m]>k) return binarySearch(l,m-1,nums,k);
        else return binarySearch(m+1,r,nums,k);
    }

    public int search(int[] nums, int target){
        return binarySearch(0, nums.length-1, nums, target);
    }
}
