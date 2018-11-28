package Useless;

public class A380 extends Flugzeuge {

    public A380 () {
        this.bezeichnung = "A380";
        this.sitzplaetze = 500;
        this.reichweite = "13.100KM";
        this.reisegeschwindigkeit = "907 km/h";
    }

    public void A380Info(){

        System.out.println("Bezeichnung: " + bezeichnung);
        System.out.println("Sitzplaetze: " + sitzplaetze);
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
