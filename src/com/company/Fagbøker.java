package com.company;

public class Fagbøker extends Bøker {

    private String fagfelt;
    private boolean studentUtgave;


    public Fagbøker(String forfatter, String tittel, int antallSider, String fagfelt, boolean studentUtgave, String type){
        super(forfatter, tittel, antallSider, type);
        this.fagfelt = fagfelt;
        this.studentUtgave = studentUtgave;
    }

    public void bokInformasjon(){
        System.out.println("Forfatter: " + getForfatter() + "\n" +
                            "Tittel: " + getTittel() + "\n" +
                            "Antall sider: " + getAntallSider() + "\n" +
                            "Fagfelt: " + fagfelt + "\n" +
                            "Studentutgave: " + studentUtgave + "\n" +
                            "Type: " + getType());
    }


    public String getFagfelt() {
        return fagfelt;
    }

    public boolean isStudentUtgave() {
        return studentUtgave;
    }
}
