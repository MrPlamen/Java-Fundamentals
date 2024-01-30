

import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase(Locale.ROOT);
        String[] array= input.split("");
        int sum = 0;

        for (String var : array) {
            if (isAVowel(var).equals("vowel")) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static String isAVowel(String letter) {
        if (letter.equals("a") || letter.equals("e") || letter.equals("o") || letter.equals("i") ||
                letter.equals("y") || letter.equals("u")) {
            return "vowel";
        } else {
            return "not vowel";
        }
    }
}
