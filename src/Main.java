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
    }
}