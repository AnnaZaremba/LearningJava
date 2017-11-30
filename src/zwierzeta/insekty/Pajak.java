package zwierzeta.insekty;

public class Pajak extends Insekt {

    private boolean czySzczekoczulkiProstopadle;

    public Pajak(String imie, String gatunek, String kontynentWystepowania, boolean czySzczekoczulkiProstopadle) {
        super(imie, gatunek, kontynentWystepowania);
        this.czySzczekoczulkiProstopadle = czySzczekoczulkiProstopadle;
    }

    public boolean isCzySzczekoczulkiProstopadle() {
        return czySzczekoczulkiProstopadle;
    }

    public void setCzySzczekoczulkiProstopadle(boolean czySzczekoczulkiProstopadle) {
        this.czySzczekoczulkiProstopadle = czySzczekoczulkiProstopadle;
    }
}
