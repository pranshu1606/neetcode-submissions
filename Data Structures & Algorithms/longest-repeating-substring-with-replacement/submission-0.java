class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int ans = 0;
        int max_Frequency = 0;
        for(int right=0;right<s.length();right++){  
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),1);
            }
            else{
                map.put(s.charAt(right),map.get(s.charAt(right))+1);
            }
            max_Frequency = Math.max(max_Frequency,map.get(s.charAt(right)));
            while((right-left+1)-max_Frequency>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
