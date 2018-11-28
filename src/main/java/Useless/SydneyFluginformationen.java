package Useless;


public class SydneyFluginformationen extends FluginformationenAbs {

    public void SydneyFlug(String abflugZeit, String flugzeugart){
        this.abflugZeit = abflugZeit;
        this.flugzeugart = flugzeugart;
    }

    Flugnummer nummern = new Flugnummer();
    Boeing747 flugzeug = new Boeing747();
    Boeing787 flugzeug2 = new Boeing787();
    Zeiten objZeit = new Zeiten();

    public void SydneyFlugInfos(){
        System.out.println("Reiseziel: Sydney");
        nummern.sydneyFlugNummer1();
        objZeit.sydneyFlug1();
        System.out.println("Flugzeugart: " + flugzeug.getBezeichnung());
        System.out.println(" ");


    }

    public void SydneyFlug2Infos(){
        System.out.println("Reiseziel: Sydney");
        nummern.sydneyFlugNummer2();
        objZeit.sydneyFlug2();
        System.out.println("Flugzeugart: " + flugzeug2.getBezeichnung());
        System.out.println(" ");

    }

    public String getAbflugsZeit(){
        return abflugZeit;
    }

    public void setAbflugsZeit(String abflugZeit){
        this.abflugZeit = ankunftsZeit;
    }

    public String getFlugzeugart(){
        return flugzeugart;
    }

    public void setFlugzeugart(String flugzeugart){
        this.flugzeugart = flugzeugart;
    }
}
