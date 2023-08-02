package fastcampus.algorithm.string;

public class CharacterConvertor {

    public char convertBigSmall(char c) {
        if (Character.isLowerCase(c)) {
            return Character.toUpperCase(c);
        } else if (Character.isUpperCase(c)) {
            return Character.toLowerCase(c);
        }

        return c;
    }

    public String convertBigSmallString(String targetStr) {
        String convertedStr = "";
        for (char ch : targetStr.toCharArray()) {
            convertedStr += convertBigSmall(ch);
        }
        return convertedStr;
    }
}
