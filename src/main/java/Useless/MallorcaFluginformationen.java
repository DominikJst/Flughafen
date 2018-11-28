package Useless;

public class MallorcaFluginformationen extends FluginformationenAbs {


    public void MallorcaFlug (String abflugZeit){
        this.abflugZeit = abflugZeit;

    }

    Flugnummer nummern = new Flugnummer();
    Zeiten objZeit = new Zeiten();
  //  A340 flugzeug = new A340();
    A350 flugzeug2 = new A350();

    public void MallorcaFlugInfos(){

        System.out.println("Reiseziel: Palma de Mallorca");
        nummern.malleFlugNummer1();
        objZeit.malleFlug1();
       // System.out.println("Flugzeugart: " + flugzeug.getBezeichnung());
        System.out.println(" ");

    }

    public void MallorcaFlug2Infos(){

        System.out.println("Reiseziel: Palma de Mallorca");
        nummern.malleFlugNummer2();
        objZeit.malleFlug2();
        System.out.println("Flugzeugart: " + flugzeug2.getBezeichnung());
        System.out.println(" ");

    }


    public String getAbflugezeit(){
        return abflugZeit;
    }

    public void setAbflugzeit (String abflugzeit){
        this.abflugZeit = abflugzeit;
    }

    public String getFlugzeugart(){
        return flugzeugart;
    }

    public void setFlugzeugart(String flugzeugart){
        this.flugzeugart = flugzeugart;
    }
}
