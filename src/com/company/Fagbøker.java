package com.company;

public class Fagbøker extends Bøker {

    private String fagfelt;
    private boolean studentUtgave;


    public Fagbøker(String forfatter, String tittel, int antallSider, String fagfelt, boolean studentUtgave){
        super(forfatter, tittel, antallSider);
        this.fagfelt = fagfelt;
        this.studentUtgave = studentUtgave;
    }

    public void bokInformasjon(){
        System.out.println("Forfatter: " + getForfatter() + "\n" +
                            "Tittel: " + getTittel() + "\n" +
                            "Antall sider: " + getAntallSider() + "\n" +
                            "Fagfelt: " + fagfelt + "\n" +
                            "Studentutgave: " + studentUtgave);
    }


}
