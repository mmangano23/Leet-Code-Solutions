class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] vals = new int[26];

        for (char ch : magazine.toCharArray()) {
            vals[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (vals[ch - 'a'] == 0) {
                return false;
            }
            vals[ch - 'a']--;
        }

        return true;
    }
}