class Solution {
    public boolean isPalindrome(String s) {
        int left = 0; // Start pointer
        int right = s.length() - 1; // End pointer

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Convert uppercase letters to lowercase
            if (Character.isUpperCase(leftChar)) {
                leftChar = Character.toLowerCase(leftChar);
            }
            if (Character.isUpperCase(rightChar)) {
                rightChar = Character.toLowerCase(rightChar);
            }

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            // Check for equality
            if (leftChar != rightChar) {
                return false; // Not a palindrome
            }

            left++;
            right--;
        }

        return true; // Is a palindrome
    }
}

