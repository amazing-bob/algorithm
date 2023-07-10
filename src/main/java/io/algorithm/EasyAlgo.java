package io.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EasyAlgo {

    public int[] countUp(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }

    public String printNChar(String str, int i) {
        return str.substring(0, i);
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public int handleNumber(int n, String control) {
        Map<Character, Integer> controlMap = new HashMap<>();
        controlMap.put('w', 1);
        controlMap.put('s', -1);
        controlMap.put('d', 10);
        controlMap.put('a', -10);

        int result = n;
        for (char c : control.toCharArray()) {
            result += controlMap.get(c);
        }
        return result;
    }
    public int commonMutiple(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        }
        return 0;
    }

    public String inverseCase(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += c;
            }
        }
        return result;
    }

    public String strMultiple(String str, int n) {
        return str.repeat(n);
    }

    public String strOverride(String targetStr, String overridingStr, int startIdx) {
        char[] targetStrArr = targetStr.toCharArray();
        for (int i = startIdx; i < targetStr.length(); i++) {
            int overridingStrIdx = i - startIdx;
            if (overridingStrIdx < overridingStr.length()) {
                targetStrArr[i] = overridingStr.charAt(overridingStrIdx);
            }
        }
        return new String(targetStrArr);
    }

    public String anergram(String word) {
        return "";
    }
}
