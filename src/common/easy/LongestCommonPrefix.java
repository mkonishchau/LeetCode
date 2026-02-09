package common.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    static void main() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        if (strs.length < 1 || strs[0].isEmpty()) {
            return prefix.toString();
        }
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            int finalI = i;
            if (!Arrays.stream(strs).allMatch(x -> finalI < x.length() && x.charAt(finalI) == first.charAt(finalI))) {
                return prefix.toString();
            }
            prefix.append(first.charAt(finalI));
        }
        return prefix.toString();
    }
}
