package samouczek;

import java.util.Arrays;

public class Sudoku {

    public static void main(String[] args) {

//        Pierwszy sposób

        Integer[] sudoku1 = new Integer[]{2, null, null, 6, null, 7, 5, null, null};
        Integer[] sudoku2 = new Integer[]{null, null, null, null, null, null, null,  9, 6};

        System.out.println("Pierwszy sposób:");
        System.out.println(Arrays.toString(sudoku1));
        System.out.println(Arrays.toString(sudoku2));


//        Drugi sposób

        Integer[][] sudoku = new Integer[9][9];

        sudoku[0][0] = 2;
        sudoku[0][1] = null;
        sudoku[0][2] = null;
        sudoku[0][3] = 6;
        sudoku[0][4] = null;
        sudoku[0][5] = 7;
        sudoku[0][6] = 5;
        sudoku[0][7] = null;
        sudoku[0][8] = null;

        sudoku[1][0] = null;
        sudoku[1][1] = null;
        sudoku[1][2] = null;
        sudoku[1][3] = null;
        sudoku[1][4] = null;
        sudoku[1][5] = null;
        sudoku[1][6] = null;
        sudoku[1][7] = 9;
        sudoku[1][8] = 6;

        System.out.println();
        System.out.println("Drugi sposób:");
        System.out.println(
                "|" + sudoku[0][0] + "|" + sudoku[0][1] + "|" + sudoku[0][2] + "|" + sudoku[0][3] + "|" + sudoku[0][4]
                        + "|" + sudoku[0][5] + "|" + sudoku[0][6] + "|" + sudoku[0][7] + "|" + sudoku[0][8] + "|");
        System.out.println(
                "|" + sudoku[1][0] + "|" + sudoku[1][1] + "|" + sudoku[1][2] + "|" + sudoku[1][3] + "|" + sudoku[1][4]
                        + "|" + sudoku[1][5] + "|" + sudoku[1][6] + "|" + sudoku[1][7] + "|" + sudoku[1][8] + "|");


//        Trzeci sposób

        System.out.println();
        System.out.println("Trzeci sposób:");

        Integer[][] s = new Integer[][] {
                new Integer[] { 2, null, null, 6, null, 7, 5, null, null },
                new Integer[] { null, null, null, null, null, null, null, 9, 6 },
                new Integer[] { 2, null, null, 6, null, 7, 5, null, null },
                new Integer[] { 2, null, null, 6, null, 7, 5, null, null },
                new Integer[] { 2, null, null, 6, null, 7, 5, null, null },
                new Integer[] { 2, null, null, 6, null, 7, 5, null, null },
                new Integer[] { 2, null, null, 6, null, 7, 5, null, null },
                new Integer[] { 2, null, null, 6, null, 7, 5, null, null },
                new Integer[] { 2, null, null, 6, null, 7, 5, null, null },
        };

        for (Integer[] wiersz: s) {
            System.out.print("|");
            for (Integer komorka: wiersz) {
                System.out.print(komorka + "|");
            }
            System.out.println("");
        }

    }
}
