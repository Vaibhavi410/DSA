class Solution {
    public boolean isPalindrome(int x) {
        
        String k = String.valueOf(x);
        String m = new StringBuilder(k).reverse().toString();

        if (k.equals(m)) {
            return true;
        } else {
            return false;
        }
    }
}

    