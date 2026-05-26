// 3136. Valid Word
class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3)
            return false;

        boolean hasVowel = false;
        boolean hasConst = false;

        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch))
                return false;

            if (Character.isLetter(ch)) {
                char c = Character.toLowerCase(ch);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    hasVowel = true;
                else
                    hasConst = true;
            }

        }
        return hasVowel && hasConst ;
    }
}
