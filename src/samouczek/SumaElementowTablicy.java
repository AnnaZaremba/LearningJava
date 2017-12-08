package samouczek;

import java.util.Arrays;

public class SumaElementowTablicy {

    //        Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.

    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Elementy tablicy: " + Arrays.toString(x));

        int wynik = getSum(x);
        System.out.println("Suma elementów tablicy: " + wynik);
    }

    private static int getSum(int[] elementy) {
        int sum = 0;

        for (int i = 0; i < elementy.length; i++) {
            sum = sum + elementy[i];
        }

        return sum;
    }

}
