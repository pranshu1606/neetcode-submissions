class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(!map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i),1);
            }
            else{
                map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
            }
        }
        int left = 0;
        for(int right=0;right<s2.length();right++){
            if(!map2.containsKey(s2.charAt(right))){
                map2.put(s2.charAt(right),1);
            }
            else{
                map2.put(s2.charAt(right),map2.get(s2.charAt(right))+1);
            }
            if((right-left+1)>s1.length()){
                map2.put(s2.charAt(left),map2.get(s2.charAt(left))-1);
                if(map2.get(s2.charAt(left))==0){
                    map2.remove(s2.charAt(left));
                }
                left++;
            }
            if((right-left+1)==s1.length()){
                if(map1.equals(map2)){
                    return true;
                }
            }
        }
        return false;
    }
}
