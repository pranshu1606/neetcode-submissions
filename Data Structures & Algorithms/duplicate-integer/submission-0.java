class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}