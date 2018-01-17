package com.company;
import java.util.HashMap;
public class KursSammling {

    private String kursKode;
    private HashMap<String, Fagbøker> kurs;

    public KursSammling() {
        kurs = new HashMap<>();
    }

    public boolean leggTilKurskodeOgFagbok(String kurskode, Fagbøker fagbok){
        for(String s : kurs.keySet()){
            if(kurskode.equals(s)){
                System.out.println("Kurset har allerede en fagbok.");
                return false;
            }
        }
        kurs.put(kurskode, fagbok);
        return true;
    }



}
