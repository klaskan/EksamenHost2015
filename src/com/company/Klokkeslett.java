package com.company;

public class Klokkeslett {

    private int timer;
    private int minutter;
    private int sekunder;

    public Klokkeslett(int timer, int minutter, int sekunder){
        setTimer(timer);
        setMinutter(minutter);
        setSekunder(sekunder);
    }


    public void setTimer(int timer){
        if(timer > 23 || timer < 0){
            this.timer = 0;
        }else{
            this.timer = timer;
        }
    }


    public void setMinutter(int minutter){
        if(minutter >= 60){
        while(minutter >= 60) {
            minutter = minutter - 60;
            setTimer(timer = timer +1);
        }
        }else{
            this.minutter = minutter;
        }
    }

    /**
     * Skal skjekke om det tallet du skriver inn er greit skulle det være over
     * 60 sekunder plusser man på 1 på minutter.
     * @param sekunder  hvor mange sekunder vi ønsker skal være oppgitt.
     */

    public void setSekunder(int sekunder){

        if(sekunder > 60 ){
            while (sekunder > 60){
                sekunder = sekunder - 60;
                this.minutter++;
            }
        }else{
            this.sekunder = sekunder;
        }
    }


    public int getTimer(){
        return timer;
    }

    public int getMinutter(){
        return minutter;
    }

    public int getSekunder(){
        return sekunder;
    }


    public void eitMinuttFrem(){
        minutter = minutter + 1;
        setMinutter(minutter);

    }

    public void eitMinuttTilbake(){
        minutter = minutter -1;
        if(minutter<0){
            minutter = 59;
            timer--;
        }
    }

    /**
     * Skriver ut hva klokken er og formaterer det slik at det skal se bra ut.
     *
     */
    public void visTid(){
        String stringTimer = "";
        String stringMinutter = "";
        String stringSekunder = "";

        if(timer < 10){
            stringTimer = "0"+timer;
        }else{
            stringTimer = "" + timer;
        }

        if(minutter < 10){
            stringMinutter = "0"+minutter;
        }else{
            stringMinutter = ""+minutter;
        }

        if(sekunder < 10){
            stringSekunder = "0"+sekunder;
        }else{
            stringSekunder = "" +sekunder;
        }

        System.out.println(stringTimer + ":" + stringMinutter + ":" + stringSekunder );

    }




}
