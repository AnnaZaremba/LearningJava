package samouczek;

import java.util.Scanner;

public class CzyTempJestDodatnia {

    public static void main(String[] args) {
        Scanner tempScanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę:");
        String temp = tempScanner.nextLine();

        System.out.println("Temperatura wpisana przez usera: " + temp);

        if(isTempPositive(Integer.parseInt(temp))) {
            System.out.println("Temperatura dodatnia");
            return;
        }

        System.out.println("Temperatura ujemna");
    }

    private static boolean isTempPositive(int temp) {
        return temp > 0;
    }
}

