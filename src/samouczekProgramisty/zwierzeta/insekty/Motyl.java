package samouczekProgramisty.zwierzeta.insekty;

public class Motyl extends Insekt {

    private int iloscSkrzydel;

    public Motyl(String imie, String gatunek, String kontynentWystepowania) {
        super(imie, gatunek, kontynentWystepowania);
    }

    public int getIloscSkrzydel() {
        return iloscSkrzydel;
    }

    public void setIloscSkrzydel(int iloscSkrzydel) {
        this.iloscSkrzydel = iloscSkrzydel;
    }
}
