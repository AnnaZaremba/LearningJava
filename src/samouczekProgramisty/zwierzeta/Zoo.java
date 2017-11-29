package samouczekProgramisty.zwierzeta;

import samouczekProgramisty.zwierzeta.insekty.Motyl;
import samouczekProgramisty.zwierzeta.insekty.Pajak;
import samouczekProgramisty.zwierzeta.ssaki.Slon;

public class Zoo {

    public static void main(String[] args) {

        Zwierze katka = new Slon("Katka", "Słoń", "Afryka", 4);
        Zwierze wiki = new Slon("Wiki", "Słoń", "Azja", 4);

        Wybieg wybiegDlaSloni = new Wybieg("Wybieg dla słoni");
        wybiegDlaSloni.dodajZwierze(katka);
        wybiegDlaSloni.dodajZwierze(wiki);

        System.out.println(wybiegDlaSloni);

        Zwierze olga = new Motyl("Olga", "Motyl","Europa");
        Zwierze ernest = new Pajak("Ernest", "Pająk", "Ameryka Południowa",true);

        Wybieg wybiegDlaInsektow = new Wybieg("Wybieg dla insektów");
        wybiegDlaInsektow.dodajZwierze(olga);
        wybiegDlaInsektow.dodajZwierze(ernest);

        System.out.println(wybiegDlaInsektow);
    }
}
