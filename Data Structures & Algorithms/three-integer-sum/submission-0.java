class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = 0;
                for(int k=j+1;k<nums.length;k++){
                    sum  = nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if(!list1.contains(list)){
                            list1.add(list);
                        }
                    }
                }
            }
        }
        return list1;
    }
}
