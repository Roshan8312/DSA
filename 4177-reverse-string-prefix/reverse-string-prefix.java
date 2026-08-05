public class Solution {
    public static String reversePrefix(String s, int k) {
        if (s == null || s.length() <= 1 || k <= 1) {
            return s;
        }
        if (k > s.length()) {
            k = s.length();
        }
        StringBuilder prefix = new StringBuilder(s.substring(0, k));
        prefix.reverse();
        prefix.append(s.substring(k));
        return prefix.toString();
    }
}
