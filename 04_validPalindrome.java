class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        String str = lower.replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = str.length() - 1;

        while(left < right){

            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}