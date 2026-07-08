class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        for(int j=0;j<nums.length;j++){
            arr[j] = nums[j];
        }
        for(int i=0;i<nums.length;i++){
            int count = 0;
            int product = 1;
            while(count<nums.length){
                if(count!=i){
                    product *= arr[count];
                }
                count++;
            }
            nums[i] = product;
        }
        return nums;
    }
}  
