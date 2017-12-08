package samouczek;

public class PetleInstrukcjeWarunkowe {


    public static void main(String[] args) {

//        Liczby od 0 do 10

        for (int number = 0; number <= 10; number++) {
            System.out.println(number);
        }

        System.out.println();

//        Liczby od 20 do 10

        for (int number = 20; number <= 20 && number >= 10; number--) {
            System.out.println(number);
        }

//        Wszystkie liczby od 10 do 20 włącznie

        System.out.println();

        int number = 10;
        while (number >= 10 && number <= 20) {
            System.out.println(number);
            number++;
        }

//        Liczby nieparzyste od -10 do 40

        System.out.println();

        for (int i = -10; i <= 40; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("nieparzysta " + i);
        }

        System.out.println();

        int j = -10;
        while (j < 40) {
            if (j % 2 == 0) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}

////        Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.
//
//        System.out.println();
//
//        int[] sumaTablicy = new int[]{2, 3, 5, 7};
//
////        Wyświetlenie wszystkich elementów tablicy
//
//        for (int index = 0; index < sumaTablicy.length; index++) {
//            System.out.println(sumaTablicy[index]);
//        }
//
//        System.out.println("Suma liczb w tablicy wynosi: " + sumArray(sumaTablicy));
//
////         Przerób funkcję z poprzedniego zadania tak, żeby metoda przymowała tablicę dwuwymiarową typu int[][].
//
//        System.out.println();
//
//        int[][] worki = new int[][]{{2, 3, 4}, {2, 4, 6}, {4, 5, 8}};
//
//        for (int i = 0; i < worki.length; i++) {
//            int[] elementyWorka = worki[i];
//
//            System.out.println();
//
//            for (int x = 0; x < elementyWorka.length; x++) {
//                System.out.println(elementyWorka[x]);
//            }
//        }
//
//
//    }
//
//    private static int sumArray(int[] sumaTablicy) {
//        int sum = 0;
//        for (int number : sumaTablicy) {
//            sum += number;
//        }
//        return sum;
//    }
//
//}
