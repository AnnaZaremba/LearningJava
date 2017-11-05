package learningJava;

public class SumaTablicy {

    public static void main(String[] args) {
int[] liczby = {1, 4, 6, 7};

       int suma = 0;

       for(int liczba: liczby) {
           suma += liczba;
        }

        System.out.println(suma);
    }
}
