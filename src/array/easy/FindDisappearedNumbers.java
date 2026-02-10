package array.easy;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    static void main() {
        FindDisappearedNumbers solution = new FindDisappearedNumbers();
        System.out.println(solution.findDisappearedNumbersNoExtraSpace(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(solution.findDisappearedNumbers(new int[]{1, 1}));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i] - 1] = nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public List<Integer> findDisappearedNumbersNoExtraSpace(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = Math.abs(nums[i]) - 1;
            if (nums[curr] > 0) {
                nums[curr] *= -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }

        return list;
    }
}
