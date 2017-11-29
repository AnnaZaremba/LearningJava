package samouczekProgramisty.zwierzeta.ssaki;

public class Walen extends Ssak{

    private boolean czyPosiadaZeby;

    public Walen(String imie, String gatunek, String kontynentWystepowania, int iloscNog, boolean czyPosiadaZeby) {
        super(imie, gatunek, kontynentWystepowania, iloscNog);
        this.czyPosiadaZeby = czyPosiadaZeby;
    }

    public boolean isCzyPosiadaZeby() {
        return czyPosiadaZeby;
    }

    public void setCzyPosiadaZeby(boolean czyPosiadaZeby) {
        this.czyPosiadaZeby = czyPosiadaZeby;
    }
}
