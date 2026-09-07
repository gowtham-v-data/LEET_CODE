class Solution {
    public String longestPalindrome(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String Lps = "";
        for (int i = 0; i < str.length(); i++) {
            // Odd length palindrome
            int low = i;
            int high = i;
            while (low >= 0 && high < str.length()
                    && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }
            String palindrome = str.substring(low + 1, high);
            if (palindrome.length() > Lps.length()) {
                Lps = palindrome;
            }
            // Even length palindrome
            low = i - 1;
            high = i;
            while (low >= 0 && high < str.length()
                    && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }
            palindrome = str.substring(low + 1, high);
            if (palindrome.length() > Lps.length()) {
                Lps = palindrome;
            }
        }
        return Lps;
    }
}