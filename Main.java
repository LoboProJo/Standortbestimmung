import javax.sound.sampled.AudioFileFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Autovermietung autovermietung = new Autovermietung();
        Auto auto = new Auto(6,true,"ZH 172834");
        Auto auto1 = new Auto(2,false,"ZH 310");
        Boot boot = new Boot(10,false,"ZH 182738");
        Boot boot1 = new Boot(4, true,"ZH 493278");


        autovermietung.fahrzeugHinzufuegen(auto);
        autovermietung.fahrzeugHinzufuegen(auto1);
        autovermietung.fahrzeugHinzufuegen(boot);
        autovermietung.fahrzeugHinzufuegen(boot1);





        Scanner scanner = new Scanner(System.in);


            boolean weiter = true;

        while(weiter){
            System.out.println("=== Autovermietung Menü ===");
            System.out.println("1) Alle Fahrzeuge anzeigen");
            System.out.println("2) Fahrzeuge mieten und zurückgeben anhand Kennzeichen");
            System.out.println("0) Beenden");
            System.out.println("Auswahl: ");

            String eingabe = scanner.nextLine();


            switch(eingabe){
                case "1":
                    autovermietung.alleFahrzeugeAnzeigen();
                    break;
                case "2":
                    System.out.println("Gib das gesuchte Kennzeichen ein");
                    String gesuchtesKennzeichen = scanner.nextLine();
                    autovermietung.sucheNachKennzeichen(gesuchtesKennzeichen);
                    autovermietung.pruefeObFahrzeugVermietet(gesuchtesKennzeichen);
                    break;
                case "0":
                    weiter = false;
                    System.out.println("Programm wird beendet.");
                    break;

                default:
                    System.out.println("Ungültige Eingabe, bitte erneut versuchen.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
