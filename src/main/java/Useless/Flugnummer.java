package Useless;

import java.util.*;

public class Flugnummer {

    public String nummern;

    public void nummern(){
        this.nummern = nummern;
    }

    ArrayList<Flugnummer> nummernListe = new  ArrayList<Flugnummer>();

    public void malleFlugNummer1(){
        nummernListe.add(0, new Flugnummer());
        nummernListe.get(0).setNummern("DE356");
        System.out.println("Flugnummer: " + nummernListe.get(0).getNummern());
    }

    public void malleFlugNummer2(){
        nummernListe.add(0, new Flugnummer());
        nummernListe.get(0).setNummern("DE128");
        System.out.println("Flugnummer: " + nummernListe.get(0).getNummern());
    }

    public void yorkFlugNummer1(){
        nummernListe.add(0, new Flugnummer());
        nummernListe.get(0).setNummern("LH474");
        System.out.println("Flugnummern: " + nummernListe.get(0).getNummern());
    }

    public void yorkFlugNummer2(){
        nummernListe.add(0, new Flugnummer());
        nummernListe.get(0).setNummern("LH487");
        System.out.println("Flugnummern: " + nummernListe.get(0).getNummern());
    }

    public void sydneyFlugNummer1(){
        nummernListe.add(0, new Flugnummer());
        nummernListe.get(0).setNummern("LH730");
        System.out.println("Flugnummern: " + nummernListe.get(0).getNummern());
    }

    public void sydneyFlugNummer2(){
        nummernListe.add(0, new Flugnummer());
        nummernListe.get(0).setNummern("LH786");
        System.out.println("Flugnummern: " + nummernListe.get(0).getNummern());
    }

    public String getNummern(){
        return nummern;
    }

    public void setNummern(String nummern){
        this.nummern = nummern;
    }


}
