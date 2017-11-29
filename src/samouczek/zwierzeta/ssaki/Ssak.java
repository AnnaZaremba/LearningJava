package samouczek.zwierzeta.ssaki;

import samouczek.zwierzeta.Zwierze;

public class Ssak extends Zwierze{

    private String dzwiek;
    private int iloscNog;
    private boolean czyDrapieznik;
    private boolean czyWodny;

    public Ssak(String imie, String gatunek, String kontynentWystepowania, int iloscNog) {
        super(imie, gatunek, kontynentWystepowania);
        this.iloscNog = iloscNog;
    }

    public String getDzwiek() {
        return dzwiek;
    }

    public void setDzwiek(String dzwiek) {
        this.dzwiek = dzwiek;
    }

    public int getIloscNog() {
        return iloscNog;
    }

    public void setIloscNog(int iloscNog) {
        this.iloscNog = iloscNog;
    }

    public boolean isCzyDrapieznik() {
        return czyDrapieznik;
    }

    public void setCzyDrapieznik(boolean czyDrapieznik) {
        this.czyDrapieznik = czyDrapieznik;
    }

    public boolean isCzyWodny() {
        return czyWodny;
    }

    public void setCzyWodny(boolean czyWodny) {
        this.czyWodny = czyWodny;
    }

    @Override
    public String toString() {
        return "Ssak{" +
                "dzwiek='" + dzwiek + '\'' +
                ", iloscNog=" + iloscNog +
                ", czyDrapieznik=" + czyDrapieznik +
                ", czyWodny=" + czyWodny +
                "} " + super.toString();
    }
}
