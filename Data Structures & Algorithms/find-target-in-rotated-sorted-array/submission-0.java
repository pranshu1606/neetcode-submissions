class Solution {
    public int search(int[] nums, int target) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(target<arr[mid]){
                r = mid-1;
            }
            else if(target>arr[mid]){
                l=mid+1;
            }
            else if(target == arr[mid]){
                for(int j=0;j<nums.length;j++){
                    if(target==nums[j]){
                        return j;
                    }
                }
            }
        }
        return -1;
    }
}
