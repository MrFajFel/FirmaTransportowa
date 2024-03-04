package Transport;
import java.util.*;
import Towar.Kontener;
import Towar.Magazyn;

public abstract class Transport {
    protected ArrayList<Kontener> kontenery = new ArrayList<>();
    public void przetransportuj(Magazyn z,Magazyn dokad, int iloscKontenerow){

    }
    public abstract void zaladuj(Kontener kontener);



}
