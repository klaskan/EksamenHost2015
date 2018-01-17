package com.company;

public abstract class Bøker {

    private String forfatter;
    private String tittel;
    private int antallSider;


    public Bøker(String forfatter, String tittel, int antallSider) {
        this.forfatter = forfatter;
        this.tittel = tittel;
        this.antallSider = antallSider;
    }

    public String getForfatter() {
        return forfatter;
    }

    public String getTittel() {
        return tittel;
    }

    public int getAntallSider() {
        return antallSider;
    }
    abstract void bokInformasjon();




}
