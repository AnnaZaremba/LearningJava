package samouczek.zwierzeta;

public class Zwierze {

    private String imie;
    private String gatunek;
    private String kontynentWystepowania;

    public Zwierze(String imie, String gatunek, String kontynentWystepowania) {
        this.imie = imie;
        this.gatunek = gatunek;
        this.kontynentWystepowania = kontynentWystepowania;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getKontynentWystepowania() {
        return kontynentWystepowania;
    }

    public void setKontynentWystepowania(String kontynentWystepowania) {
        this.kontynentWystepowania = kontynentWystepowania;
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "imie='" + imie + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", kontynentWystepowania='" + kontynentWystepowania + '\'' +
                '}';
    }
}
