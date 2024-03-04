package Towar;

import java.util.*;
public class Magazyn {
   private ArrayList<Kontener> magazyn = new ArrayList<Kontener>();
   private final String miejscowosc;

   public Magazyn(String miejscowosc) {
      this.miejscowosc = miejscowosc;
   }

   public String getMiejscowosc() {
      return miejscowosc;
   }
   public Kontener wezKontener(){
      if (!magazyn.isEmpty()){
         return magazyn.getFirst();
      }
      else {
         return null;
      }
   }
}
