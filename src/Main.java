import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // задание №1
        int[] arrayOne = new int[3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;
        System.out.println(Arrays.toString(arrayOne));

        double[] arrayTwo = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arrayTwo));

        String[] arrayThree = {"skypro", "java", "developer"};
        System.out.println(Arrays.toString(arrayThree));

        // задание №2
        System.out.print(arrayOne[0]);
        for (int i = 1; i < arrayOne.length; i++) {
            int j = arrayOne[i];
            System.out.print(", " + j);
        }
        System.out.println();

        System.out.print(arrayTwo[0]);
        for (int i = 1; i < arrayTwo.length; i++) {
            double j = arrayTwo[i];
            System.out.print(", " + j);
        }
        System.out.println();

        System.out.print(arrayThree[0]);
        for (int i = 1; i < arrayThree.length; i++) {
            String j = arrayThree[i];
            System.out.print(", " + j);
        }
        System.out.println();

        // задание 3
        System.out.print(arrayOne[arrayOne.length - 1]);
        for (int i = arrayOne.length - 2; i >= 0; i--) {
            System.out.print(", " + arrayOne[i]);
        }
        System.out.println();

        System.out.print(arrayTwo[arrayTwo.length - 1]);
        for (int i = arrayTwo.length - 2; i >= 0; i--) {
            System.out.print(", " + arrayTwo[i]);
        }
        System.out.println();

        System.out.print(arrayThree[arrayThree.length - 1]);
        for (int i = arrayThree.length - 2; i >= 0; i--) {
            System.out.print(", " + arrayThree[i]);
        }
        System.out.println();

        // задача №4
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] = arrayOne[i] + 1;
            }
        }
        System.out.println("arrayOne = " + Arrays.toString(arrayOne));

        // задание 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix[i].length - 1) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int[] rows : matrix) {
            for (int column : rows) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        //задание 6

        int[] arrayFive = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arrayFive));
        int[] arrayFiveReverse = new int[arrayFive.length];
        for (int i = 0, j = arrayFive.length - 1; i < arrayFive.length; i++, j--) {
            arrayFiveReverse[j] = arrayFive[i];
        }
        arrayFive = arrayFiveReverse;
        System.out.println(Arrays.toString(arrayFive));

        // задание 7
        int[] arraySix = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(arraySix));
        if (arraySix.length % 2 == 0) {
            for (int i = 0; i < arraySix.length / 2; i++) {
                int temp = arraySix[i];
                arraySix[i] = arraySix[arraySix.length - 1 - i];
                arraySix[arraySix.length - 1 - i] = temp;
            }
        } else {
            for (int i = 0; i <= arraySix.length / 2 - 1; i++) {
                int temp = arraySix[i];
                arraySix[i] = arraySix[arraySix.length - 1 - i];
                arraySix[arraySix.length - 1 - i] = temp;
            }
        }
        System.out.println(Arrays.toString(arraySix));

        // задание 9
        int[] arraySeven = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1, -1, -2, -10, -2, 0, -1, -1, -1};
        Arrays.sort(arraySeven);
        int[] arraySevenPlus = new int[arraySeven.length];
        int[] arraySevenMinus = new int[arraySeven.length];
        for (int i = 0; i < arraySeven.length; i++) {
            if (arraySeven[i] < 1) {
                arraySevenMinus[i] = arraySeven[i];
            } else {
                arraySevenPlus[i] = arraySeven[i];
            }
        }
        Arrays.sort(arraySevenPlus);
        Arrays.sort(arraySevenMinus);
        int countMinusOne = 0;
        int countZero = 0;
        int countMinusTwo = 0;

        for (int i : arraySeven) {
            if (i == 0) countZero++;
            if (i == -1) countMinusOne++;
            if (i == -2) countMinusTwo++;
        }

        System.out.println("Пара чисел из массива " + Arrays.toString(arraySeven) + " сумма которых равна -2 это:");
        for (int sevenPlus : arraySevenPlus) {
            for (int sevenMinus : arraySevenMinus) {
                if (sevenPlus < 1) break;
                if (sevenPlus + sevenMinus == -2 && sevenMinus != 0 && sevenMinus != -2) {
                    System.out.println(sevenPlus + " и " + sevenMinus);
                }
            }
        }
        if (countMinusOne > 2) System.out.println(-1 + " и " + -1);
        if (countMinusTwo > 0 && countZero > 0) System.out.println(0 + " и " + -2);
    }
}

