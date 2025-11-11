class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null||strs.length == 0 ) {
            return "";
        }
        String result = "";
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char currentCHAR = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentCHAR) {
                    return result;
                }
            }
            result += currentCHAR;
        }
        return result;
    }


public static void main(String[] args) {
    LongestCommonPrefix sol = new LongestCommonPrefix();
    String[] strs = {"flower", "flow", "flight"};
    String lcp = sol.longestCommonPrefix(strs);
    System.out.println("Longest Common Prefix: " + lcp);
}}