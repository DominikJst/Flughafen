package Useless;

public class Boeing747 extends Flugzeuge {

    public Boeing747() {
        this.bezeichnung = "Boeing747";
        this.sitzplaetze = 414;
        this.reichweite = "14.800KM";
        this.reisegeschwindigkeit = "920 km/h";
    }

    public void Boeing747Infos(){

        System.out.println("Bezeichnung: " + bezeichnung);
        System.out.println("Sitzplätze: " + sitzplaetze);
        System.out.println("Reichweite: " + reichweite);
        System.out.println("Reisegeschwindigkeit: " + reisegeschwindigkeit);
        System.out.println(" ");
    }

    public String getBezeichnung(){
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    public int getSitzplaetze(){
        return sitzplaetze;
    }

    public void setSitzplaetze(int sitzplaetze){
        this.sitzplaetze = sitzplaetze;
    }

    public String getReichweite(){
        return reichweite;
    }

    public void setReichweite(String reichweite){
        this.reichweite = reichweite;
    }

    public String getReisegeschwindigkeit(){
        return reisegeschwindigkeit;
    }

    public void setReisegeschwindigkeit(String reisegeschwindigkeit){
        this.reisegeschwindigkeit = reisegeschwindigkeit;
    }


}
