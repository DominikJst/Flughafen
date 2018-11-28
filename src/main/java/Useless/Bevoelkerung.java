package Useless;

import java.util.ArrayList;

public class Bevoelkerung {

    public String bevoel;

    public void bevoel(){
        this.bevoel = bevoel;
    }

    ArrayList<Bevoelkerung> bevoelkerungsListe = new  ArrayList<Bevoelkerung>();

    public void bevoelkerungMalle(){
        bevoelkerungsListe.add(0, new Bevoelkerung());
        bevoelkerungsListe.get(0).setBevoelkerung("ca. 869.000");
        System.out.println("Bevoelkerungsanzahl: " + bevoelkerungsListe.get(0).getBevoelkerung());
    }

    public void bevoelkerungYork(){
        bevoelkerungsListe.add(0, new Bevoelkerung());
        bevoelkerungsListe.get(0).setBevoelkerung("ca. 8.538.000");
        System.out.println("Bevoelkerungsanzahl: " + bevoelkerungsListe.get(0).getBevoelkerung());
    }

    public void bevoelkerungSydney(){
        bevoelkerungsListe.add(0, new Bevoelkerung());
        bevoelkerungsListe.get(0).setBevoelkerung("ca. 4.029.000");
        System.out.println("Bevoelkerungsanzahl: " + bevoelkerungsListe.get(0).getBevoelkerung());

    }

    public String getBevoelkerung(){
        return bevoel;
    }

    public void setBevoelkerung(String bevoel){
        this.bevoel = bevoel;
    }


}
