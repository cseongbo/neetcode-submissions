class Solution {
    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            // 왼쪽이 문자 또는 숫자가 아니라면 건너뛰기
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }

            // 오른쪽이 문자 또는 숫자가 아니라면 건너뛰기
            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }

            // 대소문자 구분 없이 비교
            if (Character.toLowerCase(s.charAt(start))
                    != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}