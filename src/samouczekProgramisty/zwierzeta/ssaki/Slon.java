package samouczekProgramisty.zwierzeta.ssaki;

public class Slon extends Ssak {

    private boolean czyIndyjski;

    public Slon(String imie, String gatunek, String kontynentWystepowania, int iloscNog) {
        super(imie, gatunek, kontynentWystepowania, iloscNog);
    }

    public boolean isCzyIndyjski() {
        return czyIndyjski;
    }

    public void setCzyIndyjski(boolean czyIndyjski) {
        this.czyIndyjski = czyIndyjski;
    }

    @Override
    public String toString() {
        return "Slon{" +
                "czyIndyjski=" + czyIndyjski +
                "} " + super.toString();
    }
}
