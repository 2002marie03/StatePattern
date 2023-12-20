package org.example;

public class Main {
    public static void main(String[] args) {
        Avion avion=new AvionImpl();
        avion.doActivite();
        System.out.println("-------------------");
        avion.sortirDeGarage();
        System.out.println("-------------------");
        avion.entreAuGarage();
        avion.doActivite();
        avion.decoler();

    }
}