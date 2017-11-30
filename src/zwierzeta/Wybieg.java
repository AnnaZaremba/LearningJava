package zwierzeta;

import java.util.ArrayList;
import java.util.List;

public class Wybieg {

    private String nazwaWybiegu;
    private List<Zwierze> listaZwierzat;

    public Wybieg(String nazwaWybiegu) {
        this.nazwaWybiegu = nazwaWybiegu;
        listaZwierzat = new ArrayList<>();
    }

    public String getNazwaWybiegu() {
        return nazwaWybiegu;
    }

    public void setNazwaWybiegu(String nazwaWybiegu) {
        this.nazwaWybiegu = nazwaWybiegu;
    }

    public List<Zwierze> getListaZwierzat() {
        return listaZwierzat;
    }

    public void dodajZwierze(Zwierze x) {
        listaZwierzat.add(x);
    }

    @Override
    public String toString() {
        return "Wybieg{" +
                "nazwaWybiegu='" + nazwaWybiegu + '\'' +
                ", listaZwierzat=" + listaZwierzat +
                '}';
    }
}
