package learningJava;

public class LiczbyParzyste {

    public static void main(String[] args) {

        // Liczby parzyste
            for (int i = 0; i <= 10; i++) {
                if(i % 2 == 0)
                System.out.println("parzysta " + i);
            }

        // Liczby nieparzyste
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0)
                continue;
                System.out.println("nieparzysta " + i);
        }
    }
}
