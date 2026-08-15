class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                maxOne = Math.max(maxOne,count);
                count = 0;
            }
        }
        return Math.max(count,maxOne);
    }
}