/*package BessererFlughafen;

import Useless.ReisezielInformationenBearbeiten;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.Iterator;
import java.util.Scanner;

public class AdminLogindsf {


    public void AcountAbfrage() {

        InfoTerminal terminal = new InfoTerminal();

        try {

            MongoClient mongoClient = new MongoClient("localhost", 27017);

            MongoDatabase mongoDatabase = mongoClient.getDatabase("Flughafen");
            MongoCollection collection = mongoDatabase.getCollection("user");

            Scanner sc = new Scanner(System.in);
            System.out.println("Bitte geben Sie den Usernamen ein!");

            String userName = sc.nextLine();

            Document doc = (Document) collection.find(Filters.eq("name", userName)).first();

            String userId = doc.getObjectId("_id").toHexString();

            try {
                if (doc != null) {

                    System.out.println("User wurde gefunden!");
                    System.out.println(" ");
                    System.out.println("Bitte das Passwort eingeben!");

                    String userPasswort = sc.nextLine();

                    Document passwortSuche = (Document) collection.find(Filters.eq("passwort", userPasswort)).first();

                    String passId = passwortSuche.getObjectId("_id").toHexString();

                    if(passId.equals(userId)){

                        System.out.println("Login war erfolgreich!");
                        AdminAuswahl.adminMenue();
                    }


                    //weg

                    if (passId.equals(userId)) {

                        System.out.println("Login war erfolgreich!");

                        System.out.println(" ");

                        System.out.println("Waehlen Sie zwischen den Aktionen aus!");
                        System.out.println("[1] Passwort aendern");
                        System.out.println("[2] Account Anlegen");
                        System.out.println("[3] Reiseziel Informationen bearbeiten");
                        System.out.println("[4] Menues aendern");
                        System.out.println("[5] Menue Bestellungen anzeigen");
                        System.out.println("[6] User anzeigen");
                        System.out.println("[7] Verlassen");

                        String adminAuswahl = sc.nextLine();


                        if (adminAuswahl.equals("1")) {

                            System.out.println("Für welchen User möchten Sie das Passwort ändern?");

                            String userPasswortFind = sc.nextLine();

                            Document userPasswortAendern = (Document) collection.find(Filters.eq("name", userPasswortFind)).first();

                            String newUserId = userPasswortAendern.getObjectId("_id").toHexString();

                            if (userPasswortAendern != null) {


                                System.out.println("User wurde gefunden!");
                                System.out.println(" ");
                                System.out.println("Bitte das neue Passwort eingeben!");

                                String neuesUserPasswort = sc.nextLine();

                                System.out.println("Bitte mit dem alten Passwort bestätigen!");

                                String altesPasswort = sc.nextLine();

                                Document altesPasswortCheck = (Document) collection.find(Filters.eq("passwort", altesPasswort)).first();

                                String newUserPassId = altesPasswortCheck.getObjectId("_id").toHexString();


                                if (newUserId == newUserPassId) {

                                    Bson updatedValue = new Document("passwort", neuesUserPasswort);
                                    Bson updateoperation = new Document("$set", updatedValue);
                                    collection.updateOne(altesPasswortCheck, updateoperation);

                                } else {

                                    terminal.infoTerminal();

                                }

                                terminal.infoTerminal();

                            } else {

                                terminal.infoTerminal();

                            }


                        } else if (adminAuswahl.equals("2")) {

                            System.out.println("Bitte geben Sie den neuen User ein!");

                            String neuUser = sc.nextLine();
                            System.out.println(" ");
                            System.out.println("Bitte geben Sie das neue Passwort ein!");
                            String neuUserPasswort = sc.nextLine();

                            Document neuerUser = new Document("name", neuUser);
                            neuerUser.append("passwort", neuUserPasswort);

                            collection.insertOne(neuerUser);

                            System.out.println("Neuer User wurde angelegt!");
                            System.out.println(" ");
                            terminal.infoTerminal();


                        } else if (adminAuswahl.equals("3")) {

                            ReisezielInformationenBearbeiten.ReiseInfosAendern();

                        } else if (adminAuswahl.equals("4")) {


                            terminal.infoTerminal();

                        } else if (adminAuswahl.equals("5")) {

                            MenueBestellungInfoAusgabe.InfoAusgabe();

                        } else if (adminAuswahl.equals("6")) {

                            //todo User anzeigen

                            try {
                                System.out.println("Möchten Sie alle User anzeigen lassen?");
                                System.out.println(" ");
                                System.out.println("[1] Ja!");
                                System.out.println("[2] Nein!");


                                String userAnzeigenAuswahl = sc.nextLine();

                                if (userAnzeigenAuswahl.equals("1")) {


                                    MongoCollection<Document> user = mongoDatabase.getCollection("user");

                                    FindIterable<Document> iterDoc = collection.find();
                                    int i = 1;
                                    Iterator it = iterDoc.iterator();

                                    while (it.hasNext()) {
                                        System.out.println(it.next());
                                        i++;

                                        System.out.println(" ");

                                    }

                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        } else if (adminAuswahl.equals("7")) {
                            System.out.println("Kehre zum Hauptmenue zurueck!");
                            System.out.println(" ");
                            terminal.infoTerminal();
                        }

                    } else {
                        System.out.println("Das Passwort stimmt nicht überein!");
                        System.out.println(" ");
                        terminal.infoTerminal();
                    }

                } else {
                    System.out.println("Das Passwort stimmt nicht überein!");
                    System.out.println(" ");
                    terminal.infoTerminal();

                }


            } catch (Exception e) {
                System.out.println("Das Passwort wurde nicht gefunden!");
                System.out.println();
                terminal.infoTerminal();
            }

        } catch (Exception er) {
            System.out.println("Der User wurde nicht gefunden!");
            System.out.println();
            terminal.infoTerminal();
        }

    }

}
*/