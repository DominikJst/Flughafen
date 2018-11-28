package Useless;

import BessererFlughafen.InfoTerminal;

public class NewYork extends ReisezielInfo {

    InfoTerminal terminal = new InfoTerminal();

    public NewYork (String temperatur, String wetter, String bevoelkerungsanzahl){
        this.reiseziel = "NewYork";
        this.temperatur = temperatur;
        this.wetter = wetter;
        this.bevoelkerungsAnzahl = bevoelkerungsanzahl;
    }

    Temperatur temp = new Temperatur();
    Wetter wetter1 = new Wetter();
    Bevoelkerung bevoelkerung = new Bevoelkerung();

    public void ReiseinfosYork() {
        System.out.println("Reiseziel: " + reiseziel);
        temp.temp2();
        wetter1.regen();
        bevoelkerung.bevoelkerungYork();
        System.out.println(" ");
        System.out.println("Kehre zum Hauptmenue zurueck!");
        System.out.println(" ");

        terminal.infoTerminal();
    }


    public String getReiseziel(){
        return reiseziel;
    }

    public void setReiseziel(String reiseziel){
        this.reiseziel = reiseziel;
    }

    public String getTemperatur(){
        return temperatur;
    }

    public void setTemperatur(String temperatur){
        this.temperatur = temperatur;
    }

    public String getWetter(){
        return wetter;
    }

    public void setWetter(String wetter){
        this.wetter = wetter;
    }

    public String getBevoelkerungsAnzahl(){
        return bevoelkerungsAnzahl;
    }

    public void setBevoelkerungsAnzahl(String bevoelkerungsAnzahl){
        this.bevoelkerungsAnzahl = bevoelkerungsAnzahl;
    }
}
