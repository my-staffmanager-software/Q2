package upperlink;

import java.util.*;

public class Q2 {

    // Time complexity O(n), Space complexity O(1)
    public static char firstNonRepeatingChar(String word) {

        Set<Character> repeating = new HashSet<>();

        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("HELLO"));
        System.out.println(firstNonRepeatingChar("GGOOGLEEEMICROSOFT"));

    }
}
