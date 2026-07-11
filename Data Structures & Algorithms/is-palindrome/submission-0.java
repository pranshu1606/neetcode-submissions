class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "";
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s1+= s.charAt(i);
            }
        }
        int l = 0;
        int r = s1.length() - 1;
        while(l<=r){
            if(s1.charAt(l)==s1.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
