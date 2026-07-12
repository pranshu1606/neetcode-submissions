class Solution {
    public boolean isValid(HashMap<Character, Integer> need,HashMap<Character, Integer> window) {
        for (char ch : need.keySet()) {
            if (window.getOrDefault(ch, 0) < need.get(ch)) {
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!map1.containsKey(ch)){
                map1.put(ch,1);
            }
            else{
                map1.put(ch,map1.get(ch)+1);
            }
        }
        int left = 0;
        for(int right=0;right<s.length();right++){
            char ch1 = s.charAt(right);
            if(!map2.containsKey(ch1)){
                map2.put(ch1,1);
            }
            else{
                map2.put(ch1,map2.get(ch1)+1);
            }
            while(isValid(map1,map2)){
                count  = right-left+1;
                if(count<minLen){
                    minLen = count;
                    l = left;
                    r = right;
                }
                map2.put(s.charAt(left),map2.get(s.charAt(left))-1);
                if(map2.get(s.charAt(left))==0){
                    map2.remove(s.charAt(left));
                }
                left++;
            }
        }
        String subString = "";
        for(int k=l;k<=r;k++){
            subString+=s.charAt(k);
        }
        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        return subString;
    }
}
