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
        int[] arraySix = {5, 8, 2, 3, 9, 6};
        System.out.println(Arrays.toString(arraySix));
        for (int i = 0; i < arraySix.length / 2; i++) {
            int temp = arraySix[i];
            arraySix[i] = arraySix[arraySix.length - 1 - i];
            arraySix[arraySix.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arraySix));

        // задание 9
        int[] arraySeven = {1, -3, -10, 8, 124, -123, 124125, -12351235, -2135125, 0};
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
        // задание 1
        /*
        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в       формате: «Сумма трат за месяц составила … рублей».
         */
        int[] arrayEight = generateRandomArray();
        int sum = 0;
        for (int i : arrayEight) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // задание 2
        /*
            Следующая задача — найти минимальную и максимальную трату за день.
            Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в           формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */

        int[] arrayNine = generateRandomArray();
        int max = 100_000;
        int min = 200_000;
        for (int i : arrayNine) {
            if (i >= max) {
                max = i;
            }
            if (i <= min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        // задание 3
        /*
        Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
        и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
         */
        System.out.println("Средняя сумма трат за месяц составила " + sum / 30.0f + " рублей");

        // задание 4
        /*
        В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О. сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        Данные с именами сотрудников хранятся в виде массива символов (char[]).
        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".
         */
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

