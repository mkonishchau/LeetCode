package array.easy;

public class MissingNumber {
    static void main() {
        MissingNumber solution = new MissingNumber();
        System.out.println(solution.missingNumber(new int[]{3, 0, 1}));
        System.out.println(solution.missingNumber(new int[]{0, 1}));
        System.out.println(solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public int missingNumber(int[] nums) {
        int targetSum = nums.length * (nums.length + 1) / 2;
        int currentSum = 0;
        for (int n : nums) {
            currentSum += n;
        }
        return targetSum - currentSum;
    }
}
