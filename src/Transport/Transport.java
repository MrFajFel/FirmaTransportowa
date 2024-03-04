package Transport;
import java.util.*;
import Towar.Kontener;
import Towar.Magazyn;

public abstract class Transport {
    protected ArrayList<Kontener> kontenery = new ArrayList<>();
    public void przetransportuj(Magazyn z,Magazyn dokad, int iloscKontenerow){
        System.out.printf("Transportuje kontenery z %s do %s\n",z.getMiejscowosc(),dokad.getMiejscowosc());


    }
    public abstract void zaladuj(Kontener kontener);



}
