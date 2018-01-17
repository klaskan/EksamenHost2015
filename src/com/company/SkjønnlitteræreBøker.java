package com.company;

public class SkjønnlitteræreBøker extends Bøker {


    private String sjanger;

    public SkjønnlitteræreBøker(String forfatter, String tittel, int antallSider, String sjanger, String type) {
        super(forfatter, tittel, antallSider, type);
        this.sjanger = sjanger;
    }

    public void bokInformasjon(){
        System.out.println("Forfatter: " + getForfatter() + "\n" +
                "Tittel: " + getTittel() + "\n" +
                "Antall sider: " + getAntallSider() + "\n" +
                "Sjanger: " + sjanger + "\n" +
                "Type: " + getType());
    }

    public String getSjanger() {
        return sjanger;
    }
}
