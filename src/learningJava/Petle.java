package learningJava;

public class Petle {
    public static void main(String[] args) {
        String[] nazwaTablicy =
                {
                        "jeden",
                        "dwa",
                        "trzy",
                        "cztery",

                };

        int i = 0;

        while (i <= 100) {
            System.out.println(i);
            i += 10;
        }

        for (int a = 0; a <= 100; a += 5) {
            System.out.println(a);
        }

        for (int b = 0; b < nazwaTablicy.length; b++) {
            System.out.println(nazwaTablicy[b]);
        }
        // ENHANCED FOR

        for (String zmienna : nazwaTablicy) {
            System.out.println("ENHANCED " + zmienna);
        }
    }
}
