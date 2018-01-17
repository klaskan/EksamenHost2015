package com.company;
import java.util.ArrayList;

public class BokSamling {

    private ArrayList<Bøker> boksamling;

    public BokSamling() {
        boksamling = new ArrayList<>();
    }

    public void leggTilBok(Bøker bok){
        boksamling.add(bok);
    }

    public void skrivUtBøkerInfo(){
        for(Bøker b : boksamling){
            b.bokInformasjon();
            System.out.println();
        }
    }

    public int antallBøker(){
        return boksamling.size();
    }

    public int antallFagbøker(){
        int antallFagbøker = 0;
        for(Bøker b : boksamling){
            if(b.getType().toLowerCase().equals("fagbok")){
                antallFagbøker++;
            }
        }
        return antallFagbøker;

    }




}
