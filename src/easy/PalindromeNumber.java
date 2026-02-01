package easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();
        System.out.println(solution.isPalindromeWithoutString(121));
        System.out.println(solution.isPalindromeWithoutString(-121));
        System.out.println(solution.isPalindromeWithoutString(188881));
    }

    public boolean isPalindromeWithoutString(int x) {
        int reverted = 0;
        int original = x;
        while (x > 0) {
            reverted = reverted * 10 + x % 10;
            x /= 10;
        }

        return original == reverted || original == reverted / 10;
    }

    public boolean isPalindrome(int x) {
        String strNumber = String.valueOf(x);
        int p1 = 0, p2 = strNumber.length() - 1;
        while (p1 < p2) {
            if (strNumber.charAt(p1) != strNumber.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }

}
