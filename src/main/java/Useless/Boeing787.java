package Useless;

public class Boeing787 extends Flugzeuge {

    public Boeing787 () {
        this.bezeichnung = "Boeing787";
        this.sitzplaetze = 330;
        this.reichweite = "11.910KM";
        this.reisegeschwindigkeit = "903 km/h";
    }

    public void Boeing787Infos(){

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
