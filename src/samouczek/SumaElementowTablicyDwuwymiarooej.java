package samouczek;

import java.util.Arrays;

public class SumaElementowTablicyDwuwymiarooej {

//    Przerób funkcję z poprzedniego zadania tak, żeby metoda przymowała tablicę dwuwymiarową typu int[][].

    public static void main(String[] args) {

        int[][] x = {{1, 2, 3}, {2, 3, 5}, {6, 2, 1}};

        int wynik = getSum(x);
        System.out.println("Suma elementów tablicy: " + wynik);
    }

    private static int getSum(int[][] elementy) {
        int sum = 0;

        for (int i = 0; i < elementy.length; i++) {
            int[] elementyWewnetrzne = elementy[i];

            for (int j = 0; j < elementyWewnetrzne.length; j++) {
                sum = sum + elementyWewnetrzne[j];
            }

        }

        return sum;
    }

}


