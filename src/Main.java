import Towar.Kontener;
import Towar.Magazyn;
import Towar.Towar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Tworze magazyny
        Magazyn hamburg = new Magazyn("hamburg");
        Magazyn tokio = new Magazyn("hamburg");
        Magazyn wroclaw = new Magazyn("hamburg");

        // 100 kontenerow z konsolami
        for (int i =0;i<100;i++){
            tokio.dodajKontener(new Kontener(Towar.KONSOLE));
        }
        // 50 kontenerow z bananami
        for (int i =0;i<100;i++){
            tokio.dodajKontener(new Kontener(Towar.BANANY));
        }
        //40 Kontenerow z meblami

        for (int i =0;i<100;i++){
            wroclaw.dodajKontener(new Kontener(Towar.MEBLE));
        }

    }
}