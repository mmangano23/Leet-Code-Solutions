class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        LinkedList<Integer> digits = new LinkedList<>();

        while (x != 0) {
            digits.add(x % 10);
            x /= 10;
        }

        while (digits.size() > 1) {
            if (!digits.pollFirst().equals(digits.pollLast())) {
                return false;
            }
        }
        return true;
    }
}
