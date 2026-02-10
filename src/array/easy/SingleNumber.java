package array.easy;

import java.util.HashSet;

public class SingleNumber {
    static void main() {
        SingleNumber solution = new SingleNumber();
        System.out.println(solution.xorSingleNumber(new int[]{2, 2, 1}));
        System.out.println(solution.xorSingleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(solution.xorSingleNumber(new int[]{1}));
    }

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int n : nums) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        return set.iterator().next();
    }

    public int xorSingleNumber(int[] nums) {
        int temp = 0;
        for (int n : nums) {
            temp = n ^ temp;
        }
        return temp;
    }

}
