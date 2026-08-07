class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>(); 
        int i=0;
        Arrays.sort(nums);
        while(i<nums.length-2){
            int l=i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = 0;
                sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[l]);
                    list1.add(nums[r]);
                    if(!list.contains(list1)){
                        list.add(list1);
                    }
                    l++;
                    r--;
                }
                else if(sum<0){
                    l++;
                }
                else if(sum>0){
                    r--;
                }
            }
            i++;
        }
        return list;
    }
}
