package samouczek;

public class TableceWielowymiarowe {

    public static void main(String[] args) {

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


    }

}
