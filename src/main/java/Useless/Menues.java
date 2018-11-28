package Useless;

import Useless.Menue;

import java.util.*;

public class Menues {

    public static ArrayList<Menue> menuesWaehlenInListe(ArrayList<Menue> menueListe, String vorSpeise, String hauptSpeise, String nachSpeise, String getraenk){

        String vorspeise = String.valueOf(vorSpeise);
        String hauptspeise = String.valueOf(hauptSpeise);
        String nachspeise = String.valueOf(nachSpeise);
        String getraenke = String.valueOf(getraenk);
        Menue newMenue = new Menue(vorspeise, hauptspeise, nachspeise, getraenke);
        menueListe.add(newMenue);

        return menueListe;
    }

}
