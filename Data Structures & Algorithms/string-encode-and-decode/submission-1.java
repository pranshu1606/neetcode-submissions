class Solution {

    public String encode(List<String> strs) {
        String s = "";
        for(String c: strs){
            s += c + "~";
        }
        return s;
    }

    public List<String> decode(String str) {
        List<String> s = new ArrayList<>();
        String z = "";
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='~'){
                s.add(z);
                z = "";
                i++;
            }
            else{
                z += str.charAt(i);
                i++;
            }
        }
        return s;
    }
}
