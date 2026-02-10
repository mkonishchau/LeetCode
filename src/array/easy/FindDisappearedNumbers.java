package array.easy;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    static void main() {
        FindDisappearedNumbers solution = new FindDisappearedNumbers();
        System.out.println(solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(solution.findDisappearedNumbers(new int[]{1, 1}));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] temp = new int[nums.length];
        for (int num : nums) {
            temp[num - 1] = num;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
