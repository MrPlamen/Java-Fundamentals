package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());

        System.out.println(findMaxNumber(num1, num2, num3));
    }

    private static int findMaxNumber(int intOne, int intTwo, int intThree) {
        int[] array = {intOne, intTwo, intThree};
        Arrays.sort(array);
        return array[0];
    }
