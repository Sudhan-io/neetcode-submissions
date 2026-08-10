class Solution {
    public boolean isPalindrome(String s) {
        char[] c=s.toLowerCase().toCharArray();
        int l=0;
        int r=c.length-1;
        while(l<=r){
        if(!Character.isLetterOrDigit(s.charAt(l))) {
            l++;
        }
        else if (!Character.isLetterOrDigit(s.charAt(r))) {
            r--;
        }
        else{
            if (c[l]!=c[r]) return false;
            l++;
            r--;
            }
        }
        return true;
    }
}
