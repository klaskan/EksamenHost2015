package com.company;

public class SkjønnlitteræreBøker extends Bøker {


    private String sjanger;

    public SkjønnlitteræreBøker(String forfatter, String tittel, int antallSider, String sjanger) {
        super(forfatter, tittel, antallSider);
        this.sjanger = sjanger;
    }

    public void bokInformasjon(){
        System.out.println("Forfatter: " + getForfatter() + "\n" +
                "Tittel: " + getTittel() + "\n" +
                "Antall sider: " + getAntallSider() + "\n" +
                "Sjanger: " + sjanger);
    }
}
