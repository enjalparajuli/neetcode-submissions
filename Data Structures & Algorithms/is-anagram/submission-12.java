class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sFreq = new char[26];
        char[] tFreq = new char[26];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            sFreq[c1 - 'a']++;

            char c2 = t.charAt(i);
            tFreq[c2 - 'a']++;
        }


        return Arrays.equals(sFreq, tFreq);
    }
}
