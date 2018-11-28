package Useless;

public class Boeing777 extends Flugzeuge {

    public Boeing777 () {
        this.bezeichnung = "Boeing777";
        this.sitzplaetze = 414;
        this.reichweite = "13.940KM";
        this.reisegeschwindigkeit = "896 km/h";
    }

    public void boeing777Info(){
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
