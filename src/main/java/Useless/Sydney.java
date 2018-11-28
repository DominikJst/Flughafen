package Useless;

import BessererFlughafen.InfoTerminal;

public class Sydney extends ReisezielInfo {

    InfoTerminal terminal = new InfoTerminal();

    public Sydney (String temperatur, String wetter, String bevoelkerungsanzahl){
        this.reiseziel = "Sydney";
        this.temperatur = temperatur;
        this.wetter = wetter;
        this.bevoelkerungsAnzahl = bevoelkerungsanzahl;
    }

    Temperatur temp = new Temperatur();
    Wetter wetter1 = new Wetter();
    Bevoelkerung bevoelkerung = new Bevoelkerung();

    public void ReiseinfosSydney() {
        System.out.println("Reiseziel: " + reiseziel);
        temp.temp3();
        wetter1.bewoelkt();
        bevoelkerung.bevoelkerungSydney();
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
