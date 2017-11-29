package samouczekProgramisty.zwierzeta.insekty;


import samouczekProgramisty.zwierzeta.Zwierze;

public class Insekt extends Zwierze {

    private int iloscOdnozy;
    private boolean czyJadowity;

    public Insekt(String imie, String gatunek, String kontynentWystepowania) {
        super(imie, gatunek, kontynentWystepowania);
    }

    public int getIloscOdnozy() {
        return iloscOdnozy;
    }

    public void setIloscOdnozy(int iloscOdnozy) {
        this.iloscOdnozy = iloscOdnozy;
    }

    public boolean isCzyJadowity() {
        return czyJadowity;
    }

    public void setCzyJadowity(boolean czyJadowity) {
        this.czyJadowity = czyJadowity;
    }
}
