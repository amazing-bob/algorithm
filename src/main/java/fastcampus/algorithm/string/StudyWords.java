package fastcampus.algorithm.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudyWords {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.next();
        StudyWords studyWords = new StudyWords();
        System.out.println(studyWords.getMostManyBigChar(words));

        System.exit(0);
    }

    public String getMostManyBigChar(String word) {

        Map<Character, Integer> charCountMap = new HashMap<>();
        for ( char ch : word.toCharArray() ) {
            charCountMap.putIfAbsent(ch, 0);
            charCountMap.put(ch, charCountMap.get(ch)+1);
        }

        char maxChar = ' ';
        int maxCount = 0;
        for ( Map.Entry<Character, Integer> entry : charCountMap.entrySet() ) {
            if ( maxCount == 0 ) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
                continue;
            }
            if ( entry.getValue() >= maxCount  ) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        Map<Character, Integer> maxCountMap = makeMaxCountMap(charCountMap, maxCount);
        if ( maxCountMap.size() > 1 ) {
            return "?";
        }
        return String.valueOf(maxChar).toUpperCase();
    }

    private static Map<Character, Integer> makeMaxCountMap(Map<Character, Integer> charCountMap, int maxCount) {
        Map<Character, Integer> maxCountMap = new HashMap<>();
        for ( Map.Entry<Character, Integer> entry : charCountMap.entrySet() ) {
            if ( entry.getValue() == maxCount) {
                maxCountMap.put(entry.getKey(), entry.getValue());
            }
        }
        return maxCountMap;
    }

}
