package Useless;

public class NewYorkFluginformationen extends FluginformationenAbs {


    public void NewYorkFlug(String abflugZeit, String flugzeugart){
        this.abflugZeit = abflugZeit;
        this.flugzeugart = flugzeugart;
    }

    Flugnummer nummern = new Flugnummer();
    Zeiten objZeit = new Zeiten();
    Boeing777 flugzeug = new Boeing777();
    A380 flugzeug2 = new A380();

    public void YorkFlugInfos(){

        System.out.println("Reiseziel: New York");
        nummern.yorkFlugNummer1();
        objZeit.yorkFlug1();
        System.out.println("Flugzeugart: " + flugzeug.getBezeichnung());
        System.out.println(" ");

    }

    public void YorkFlug2Infos(){

        System.out.println("Reiseziel: New York");
        nummern.yorkFlugNummer2();
        objZeit.yorkFlug2();
        System.out.println("Flugzeugart: " + flugzeug2.getBezeichnung());
        System.out.println(" ");
    }


    public String getAbflugZeit(){
        return abflugZeit;
    }

    public void setAbflugzeit(String abflugZeit){
        this.abflugZeit = abflugZeit;
    }

    public String getFlugzeugart(){
        return flugzeugart;
    }

    public void setFlugzeugart(){
        this.flugzeugart = flugzeugart;
    }


}
