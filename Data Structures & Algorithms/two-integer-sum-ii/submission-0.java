class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length==0){
            return null;
        }
        int l = 0;
        int r = numbers.length - 1;
        for(int i=0;i<numbers.length;i++){
            int sum = 0;
            sum = numbers[l]+numbers[r];
            if(sum>target){
                r--;
            }
            else if(sum<target){
                l++;
            }
            else{
                return new int[]{l+1,r+1};
            }
        }
        return new int[]{-1,-1};
    }
}
