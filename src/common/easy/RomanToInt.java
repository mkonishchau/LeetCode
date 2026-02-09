package common.easy;

import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt solution = new RomanToInt();
        System.out.println(solution.romanToInt("XII"));
        System.out.println(solution.romanToInt("XIX"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
        System.out.println(solution.romanToInt("MCMIV"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int sum = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = map.get(s.charAt(i));
            if (current < prev) {
                sum -= current;
            } else {
                sum += current;
            }
            prev = current;
        }

        return sum;
    }
}
