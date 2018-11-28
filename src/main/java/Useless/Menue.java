package Useless;

public class Menue {

    public String vorspeise;
    public String hauptspeise;
    public String nachspeise;
    public String getraenk;

    public Menue(String vorspeise, String hauptspeise, String nachspeise, String getraenk){
        this.vorspeise = vorspeise;
        this.hauptspeise = hauptspeise;
        this.nachspeise = nachspeise;
        this.getraenk = getraenk;
    }

    public String getVorspeise(){
        return vorspeise;
    }

    public void setVorspeise(String vorspeise){
        this.vorspeise = vorspeise;
    }

    public String getHauptspeise(){
        return hauptspeise;
    }

    public void setHauptspeise(String hauptspeise){
        this.hauptspeise = hauptspeise;
    }

    public String getNachspeise(){
        return nachspeise;
    }

    public void setNachspeise(){
        this.nachspeise = nachspeise;
    }

    public String getGetraenk(){
        return getraenk;
    }

    public void setGetraenk(String getraenk){
        this.getraenk = getraenk;
    }
}
