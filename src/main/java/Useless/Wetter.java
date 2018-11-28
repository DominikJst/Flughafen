package Useless;

import java.util.*;

public class Wetter {


    public String wetter;

    public void Wetter(){
        this.wetter = wetter;
    }

    ArrayList<Wetter> wetterListe = new ArrayList<Wetter>();

    public void sonnenschein(){
        wetterListe.add(0, new Wetter());
        wetterListe.get(0).setWetter("Sonnenschein");
        System.out.println("Wetter: " + wetterListe.get(0).getWetter());
    }

    public void regen(){
        wetterListe.add(0, new Wetter());
        wetterListe.get(0).setWetter("Regen");
        System.out.println("Wetter: " + wetterListe.get(0).getWetter());
    }

    public void bewoelkt(){
        wetterListe.add(0, new Wetter());
        wetterListe.get(0).setWetter("Bewölkt");
        System.out.println("Wetter: " + wetterListe.get(0).getWetter());
    }

    public String getWetter(){
        return wetter;
    }

    public void setWetter(String wetter){
        this.wetter = wetter;
    }
}
