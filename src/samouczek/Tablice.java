package samouczek;

import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {

        /*
            ------------------------------------
               [0][0]   |  [0][1] |   [0][2]   |
            ------------------------------------
            ------------------------------------
               [1][0]   |  [1][1] |   [1][2]   |
            ------------------------------------
            ------------------------------------
               [2][0]   |  [2][1] |   [2][2]   |
            ------------------------------------
            ------------------------------------
               [3][0]   |  [3][1] |   [3][2]   |
            ------------------------------------
         */

        int[][] kolkoKrzyzyk = new int[3][3];

        int kolko = 1;
        int krzyzyk = 2;

        kolkoKrzyzyk[1][1] = kolko;
        kolkoKrzyzyk[2][2] = krzyzyk;
        kolkoKrzyzyk[0][0] = kolko;
        kolkoKrzyzyk[1][2] = krzyzyk;
        kolkoKrzyzyk[0][2] = kolko;
        kolkoKrzyzyk[0][1] = krzyzyk;

        System.out.println();
        System.out.println();
        System.out.println("    1 2 3");
        System.out.println("a   " + kolkoKrzyzyk[0][0] + "|" + kolkoKrzyzyk[0][1] + "|" + kolkoKrzyzyk[0][2]);
        System.out.println("b   " + kolkoKrzyzyk[1][0] + "|" + kolkoKrzyzyk[1][1] + "|" + kolkoKrzyzyk[1][2]);
        System.out.println("c   " + kolkoKrzyzyk[2][0] + "|" + kolkoKrzyzyk[2][1] + "|" + kolkoKrzyzyk[2][2]);

//        Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę

        int[] sumaDwoch = new int[2];

        sumaDwoch[0] = 23;
        sumaDwoch[1] = 7;

        System.out.println("Suma dwóch liczb jest równa: " + (sumaDwoch[0] + sumaDwoch[1]));

//        Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.

        int[] trzyLiczby = new int[3];

        trzyLiczby[0] = 4;
        trzyLiczby[1] = 34;
        trzyLiczby[2] = 14;

        Arrays.sort(trzyLiczby);

        System.out.println("Sortowanie od najwiekszej do najmniejszej: " + Arrays.toString(trzyLiczby));
        System.out.println("Największa liczba z tablicy to: " + trzyLiczby[2]);

        int[] array = new int[3];

//        Liczby losowe w tablicy

        System.out.println(Math.random());
        int max = 50;
        array[0] = (int) (max * Math.random());
        array[1] = (int) (max * Math.random());
        array[2] = (int) (max * Math.random());

        int result = Arrays.stream(array).max().getAsInt();

        System.out.println("Sortowanie od najwiekszej do najmniejszej: " + Arrays.toString(array));
        System.out.println("Największa liczba z tablicy to: " + result);

    }

}
