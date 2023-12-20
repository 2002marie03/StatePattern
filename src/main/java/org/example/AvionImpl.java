package org.example;

public class AvionImpl implements Avion {
    private State state;

    public AvionImpl() {
        state = new EtatEnPiste(this);
    }



    @Override
    public void sortirDeGarage() {
        state.excutesortirDeGarage();
    }

    @Override
    public void entreAuGarage() {
        state.excuteentreAuGarage();
    }

    @Override
    public void atterir() {
        state.excuteatterir();
    }

    @Override
    public void decoler() {
        state.excutedecoler();

    }

    @Override
    public void doActivite() {
        state.excutedoActivite();

    }


    abstract class State {
        protected AvionImpl avion;
        public State(AvionImpl avion){
           this.avion=avion;
        }
        abstract  void excutesortirDeGarage(); //operation de transition d'etat'

        abstract void excuteentreAuGarage();

        abstract void excuteatterir();

        abstract void excutedecoler();

        abstract void excutedoActivite();//Activite

    }


    class EtatEnPiste extends State {

        public EtatEnPiste(AvionImpl avion) {
            super(avion);
        }

        @Override
        void excutesortirDeGarage(){
            System.out.println("Impossible de sortir du garage car je suis deja en piste ");

        }

        @Override
        void excuteentreAuGarage() {
            System.out.println("Transition d'etat de Piste => Garage ");
             avion.state=new EtatEnGarage(avion);
        }

        @Override
        void excuteatterir() {
            System.out.println("Impossible je suis deja en piste  ");

        }

        @Override
        void excutedecoler() {
            System.out.println("Transition d'etat de Piste =>Air");
            avion.state=new EtatEnAir(avion);

        }

        @Override
        void excutedoActivite() {
            System.out.println("Activite de l'etat en piste.......");

        }
    }

    class EtatEnGarage extends State {

        public EtatEnGarage(AvionImpl avion) {
            super(avion);
        }

        @Override
        void excutesortirDeGarage() {
            System.out.println("Transition d'etat de Garage => Piste  ");
            avion.state=new EtatEnPiste(avion);
        }

        @Override
        void excuteentreAuGarage() {
            System.out.println("Impossible je suis deja au garage");
        }

        @Override
        void excuteatterir() {
            System.out.println("Impossible d'atterir je suis deja au garage");


        }

        @Override
        void excutedecoler() {
            System.out.println("Impossible de decolle je suis deja au garage ");


        }

        @Override
        void excutedoActivite() {
            System.out.println("Activite de l'etat au garage.......");
        }
    }

    class EtatEnAir extends State {

        public EtatEnAir(AvionImpl avion) {
            super(avion);
        }

        @Override
        void excutesortirDeGarage() {
            System.out.println("Impossible je suis deja dans l'air");


        }

        @Override
        void excuteentreAuGarage() {
            System.out.println("Impossible je suis deja en l'air");


        }

        @Override
        void excuteatterir() {
            System.out.println("Transition d'etat de l'air =>Piste ");
            avion.state=new EtatEnPiste(avion);


        }

        @Override
        void excutedecoler() {
            System.out.println("Impossible je suis deja en l'air");

        }

        @Override
        void excutedoActivite() {
            System.out.println("Activite de l'etat en l'air.......");
        }
    }

}




