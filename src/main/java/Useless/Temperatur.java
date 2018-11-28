package Useless;

import java.util.ArrayList;

public class Temperatur {

    public String temp;

    public void Temperatur(){
        this.temp = temp;
    }

    ArrayList<Temperatur> tempListe = new  ArrayList<Temperatur>();


    //temp für Mallorca
    public void temp1 (){
        tempListe.add(0, new Temperatur());
        tempListe.get(0).setTemp("33 Grad");
        System.out.println("Temperatur: " + tempListe.get(0).getTemp());
    }

    //temp für NewYork
    public void temp2 (){
        tempListe.add(0, new Temperatur());
        tempListe.get(0).setTemp("19 Grad");
        System.out.println("Temperatur: " + tempListe.get(0).getTemp());
    }


    //temp für Sydney
    public void temp3 (){
        tempListe.add(0, new Temperatur());
        tempListe.get(0).setTemp("25 Grad");
        System.out.println("Temperatur: " + tempListe.get(0).getTemp());
    }

    public String getTemp(){
        return temp;
    }

    public void setTemp(String temp){
        this.temp = temp;
    }
}
