package learningJava;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Butelka {
    private double ileLitrow;
    private double pojemnosc;


    public Butelka(double ileLitrow, double pojemnosc) {
        this.ileLitrow = ileLitrow;
        this.pojemnosc = pojemnosc;
    }

    public double getIleLitrow() {
        return ileLitrow;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    void wlej(double ilosc) {
        if (ilosc + ileLitrow > pojemnosc) {
            System.out.println("nie zmiesci sie wiecej");
            return;
        }
        this.ileLitrow += ilosc;
    }

    boolean wylej(double ilosc) {
        if (ilosc <= ileLitrow) {
            this.ileLitrow -= ilosc;
            return true;
        } else {
            return false;
        }
    }

    void przelej(double ilosc, Butelka gdziePrzelac) {
        if (this.wylej(ilosc)) {
            gdziePrzelac.wlej(ilosc);
        } else {
            System.out.println("Za mała ilość płynu w butelce");
        }
    }

    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[4];

        for (int i = 0; i < 4; i++) {
            butelka[i] = new Butelka(1, 2);
        }

//        butelka[0].wlej(2);

        butelka[0].przelej(2, butelka[1]);

        for (int i = 0; i < 4; i++) {
            System.out.println(butelka[i].getIleLitrow());
        }
    }


}
