package fastcampus.algorithm.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Anergram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.next();
        String compare = scanner.next();

        System.out.println(new Anergram().getCountOfRemoveChar(target, compare));
        System.exit(0);
    }

    private static Map<Character, Integer> getCharacterIntegerMap(String target) {
        Map<Character, Integer> targetStrCountMap = new HashMap<>();
        for ( char ch : target.toCharArray()) {
            if (!targetStrCountMap.containsKey(ch)) {
                targetStrCountMap.put(ch, 1);
                continue;
            }
            targetStrCountMap.put(ch, targetStrCountMap.get(ch) + 1);
        }
        return targetStrCountMap;
    }

    public int getCountOfRemoveChar(String target, String compare) {
        return target.length() + compare.length() - getCountOfAnergramChar(target, compare) * 2;
    }

    private int getCountOfAnergramChar(String target, String compare) {
        Map<Character, Integer> targetStrCountMap = getCharacterIntegerMap(target);
        Map<Character, Integer> compareStrCountMap = getCharacterIntegerMap(compare);
        int count = 0;
        for ( char ch : targetStrCountMap.keySet()) {
            if (targetStrCountMap.get(ch) == compareStrCountMap.get(ch)) {
                count += targetStrCountMap.get(ch);
            }
        }
        return count;
    }
}
