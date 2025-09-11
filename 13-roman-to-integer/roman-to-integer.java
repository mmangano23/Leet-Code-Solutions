class Solution {
    public int romanToInt(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = 0;

            // assign value based on current Roman numeral
            if (s.charAt(i) == 'I') value = 1;
            if (s.charAt(i) == 'V') value = 5;
            if (s.charAt(i) == 'X') value = 10;
            if (s.charAt(i) == 'L') value = 50;
            if (s.charAt(i) == 'C') value = 100;
            if (s.charAt(i) == 'D') value = 500;
            if (s.charAt(i) == 'M') value = 1000;

            // check subtraction rule
            if (i + 1 < s.length()) {
                int nextValue = 0;
                if (s.charAt(i + 1) == 'I') nextValue = 1;
                if (s.charAt(i + 1) == 'V') nextValue = 5;
                if (s.charAt(i + 1) == 'X') nextValue = 10;
                if (s.charAt(i + 1) == 'L') nextValue = 50;
                if (s.charAt(i + 1) == 'C') nextValue = 100;
                if (s.charAt(i + 1) == 'D') nextValue = 500;
                if (s.charAt(i + 1) == 'M') nextValue = 1000;

                if (value < nextValue) {
                    count -= value; // subtract instead of add
                    continue;
                }
            }

            count += value;
        }

        return count;
    }
}
