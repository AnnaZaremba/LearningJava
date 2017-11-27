package samouczekProgramisty;

public class CzyTempJestDodatnia {

    private static final int TEMP = -12;

    public static void main(String[] args) {


        if(isTempPositive(TEMP)) {
            System.out.println("Temperatura dodatnia");
            return;
        }

        System.out.println("Temperatura ujemna");
    }

    private static boolean isTempPositive(int temp) {
        return temp > 0;
    }
}

