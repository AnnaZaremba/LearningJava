package penguintrap;

import java.util.Scanner;

public class PenguinTrap {

    private static String[] opcje = { "NIEBIESKI", "BIAŁY", "DOWOLNY", "STRATA KOLEJKI"};

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("Wciśnij ENTER");
            enter.nextLine();
            System.out.println("Wynik: " + opcje[losujLiczbe()]);
        }
    }

    private static int losujLiczbe() {
        int liczba;

        do {
            liczba = (int) (Math.random() * 10);
        } while (liczba > 3);

        return liczba;
    }

}
