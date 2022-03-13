class Solution {
    public boolean isPalindrome(int x) {
        String s = "" + x;
        String rev = "";
        for (int i = s.length()-1 ; i >= 0 ; --i)
            rev += s.charAt(i);
        return s.equals(rev);
    }
}