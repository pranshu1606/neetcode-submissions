class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int l = n+n;
        int[] arr = new int[l];
        int i=0;
        for(i=0;i<n;i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
}