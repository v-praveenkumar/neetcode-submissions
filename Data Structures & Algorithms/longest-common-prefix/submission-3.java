class Solution {
    public String longestCommonPrefix(String[] str) {
        String res = "";

        for (int i = 0; i < str[0].length(); i++) {
            char c = str[0].charAt(i);

            for (int j = 1; j < str.length; j++) {

                if (i >= str[j].length()) {
                    return res;
                }

                if (c != str[j].charAt(i)) {
                    return res;
                }
            }

            res += c;
        }

        return res;
    }
}