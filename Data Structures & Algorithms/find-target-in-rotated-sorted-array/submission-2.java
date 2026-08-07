class Solution {
    public int search(int[] nums, int target) {
        int[] num = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i] = nums[i];
        }
        Arrays.sort(num);
        int low = 0;
        int high = num.length-1;
        while(low<=high){
            int mid  = low + (high-low)/2;
            if(target>num[mid]){
                low = mid+1;
            }
            else if(target<num[mid]){
                high=mid-1;
            }
            else if(num[mid]==target){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==target){
                        return j;
                    }
                }
            }
        }
        return -1;
    }
}
