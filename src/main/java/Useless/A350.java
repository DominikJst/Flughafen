package Useless;

public class A350 extends Flugzeuge {

    public A350 (){
        this.bezeichnung = "A350";
        this.sitzplaetze = 366;
        this.reichweite = "15.550KM";
        this.reisegeschwindigkeit = "910 km/h";
    }

    public void a350Info(){
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
