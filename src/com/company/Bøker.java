package com.company;

public abstract class Bøker {

    private String forfatter;
    private String tittel;
    private int antallSider;
    private String type;




    public Bøker(String forfatter, String tittel, int antallSider, String type) {
        this.forfatter = forfatter;
        this.tittel = tittel;
        this.antallSider = antallSider;
        this.type = type;

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

    public String getType() {
        return type;
    }
    abstract void bokInformasjon();




}
