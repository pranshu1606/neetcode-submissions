class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while(count!=k){
            int res = -1;
            int max = -1;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>max){
                    max = entry.getValue();
                    res = entry.getKey();
                }
            }
            map.remove(res);
            list.add(res);
            count++;
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);   
        }
        return result;
    }
}
