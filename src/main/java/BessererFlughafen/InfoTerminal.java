package BessererFlughafen;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.LoggerFactory;

import java.util.*;

public class InfoTerminal {


    public static void infoTerminal() {

        Scanner sc = new Scanner(System.in);

        ((LoggerContext) LoggerFactory.getILoggerFactory()).getLogger("org.mongodb.driver").setLevel(Level.ERROR); //todo nachlesen

        System.out.println("Waehlen Sie zwischen den Aktionen: ");
        System.out.println("[1] Reiseziel Informationen");
        System.out.println("[2] Fluginformationen");
        System.out.println("[3] Serviceleistungen");
        System.out.println("[4] AdminLogin");
        System.out.println("[5] Beenden");


        Reisezielinformationen reiseZiel = new Reisezielinformationen();
        Serviceleistungen service = new Serviceleistungen();
        AdminLogin adminLogin = new AdminLogin();
        Fluginformationen flugInfos = new Fluginformationen();

        int hauptauswahl = sc.nextInt();

      try{
          switch (hauptauswahl) {
              case 1:
                  reiseZiel.reisezielinformationen();
                  infoTerminal();
                  break;
              case 2:
                  FlugzeitenAusgabe.getZeiten();
                  infoTerminal();
                  break;
              case 3:
                  service.serviceleistungen();
                  infoTerminal();
                  break;
              case 4:
                  adminLogin.login();
                  infoTerminal();
                  break;
              case 5:
                  System.out.println("Auf Wiedersehen!");
                  System.exit(0);
                  break;
              default:
                  System.out.println("Bitte gueltige Eingaben taetigen!");
                  System.out.println(" ");
                  infoTerminal();
                  break;
          }
      }
      catch(Exception e){
          System.out.println("Bitte gueltige Eingaben treffen!");
          System.out.println(" ");
          infoTerminal();
      }

    }

}





