package learningJava;

public class CoDrugiWiersz {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                if (j % 2 == 0) {
                    continue;
                }
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
