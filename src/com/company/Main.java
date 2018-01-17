package com.company;

public class Main {

        public static void main(String[] args) {

            /**
             * Oppgave 1
             *
             * a)
             * Her vil vi få en kompileringsfeil siden vi prøver å gi en string til en int type.
             *
             * b)
             * Her vil vi få en kompileringsfeil siden int y < x forventer å få en boolean.
             *
             * c)
             * Her vil man ikke skrive ut noe. siden x < 0
             *
             * d)
             * Her vil vi også få en kompileringsfeil siden man ikke har definert i.
             *
             *e)
             *
             * *
             * **
             * ***
             * ****
             * *****
             * ******
             * *******
             * ********
             * *********
             *
             *
             *f)
             *
             *
             *
             *
             * Oppgave 2
             * a) Hva er hensikten med innkapsling?
             * Hensikten med innkapsling er å sørge for at at man ikke gir vekk tilgang til absolutt alt.
             * Innkapslig gjør at det er kun hva klassen gjør / tilbyr som er synlig utenfor klassen og ikke alt annet.
             * Og ikke hvordan klassen gjør de spesifikke oppgavene for eksempel.
             *
             *
             * b
             *
             *
             *
             *
             */

            Klokkeslett klokkeslett = new Klokkeslett(25, 120, 6);
            klokkeslett.visTid();
            //String tittel, int antallSider, String fagfelt, boolean studentUtgave
            Fagbøker fagbok1 = new Fagbøker("klas", "GeografiBoka", 60, "Geografi", false, "fagbok");
            Fagbøker fagbok2 = new Fagbøker("Ida", "matteboka", 100, "Matte", true, "skjønnliterær");
            SkjønnlitteræreBøker skjønnlitteræreBøker1 = new SkjønnlitteræreBøker("anna", "Brille", 200, "Krim", "fagbok");

            KursSammling kursSammling = new KursSammling();
            BokSamling bokSamling = new BokSamling();
            bokSamling.leggTilBok(fagbok1);
            bokSamling.leggTilBok(skjønnlitteræreBøker1);
            bokSamling.leggTilBok(fagbok2);
            System.out.println(bokSamling.antallBøker());
            bokSamling.skrivUtBøkerInfo();
            System.out.println(bokSamling.antallFagbøker());
            System.out.println(fagbok1.getForfatter());







        }
}
