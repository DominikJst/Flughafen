package Useless;

import BessererFlughafen.InfoTerminal;

public class Mallorca extends ReisezielInfo {

    InfoTerminal terminal = new InfoTerminal();

    public Mallorca (String temperatur, String wetter, String bevoelkerungsAnzahl){
        this.reiseziel = "Palma de Mallorca";
        this.temperatur = temperatur;
        this.wetter = wetter;
        this.bevoelkerungsAnzahl = bevoelkerungsAnzahl;
    }

    Temperatur temp = new Temperatur();
    Bevoelkerung bevoelkerung = new Bevoelkerung();
    Wetter wetter1 = new Wetter();


    public void ReiseinfosMalle() {
        System.out.println("Reiseziel: " + reiseziel);
        temp.temp1();
        wetter1.sonnenschein();
        bevoelkerung.bevoelkerungMalle();
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
