import java.util.ArrayList;
import java.util.Scanner;

public class Autovermietung {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Fahrzeug> fahrzeugList = new ArrayList<>();

    public void fahrzeugHinzufuegen(Fahrzeug fahrzeug) {
        fahrzeugList.add(fahrzeug);
    }

    public void alleFahrzeugeAnzeigen() {
        for (Fahrzeug fahrzeug : fahrzeugList) {
            System.out.println("Kennzeichen: " + fahrzeug.getKennzeichen());
            System.out.println("Sitzplatzkapazität: " + fahrzeug.getAnzahlSitzplaetze() + "\n");
        }
    }

    public boolean pruefeObFahrzeugVermietet(String kennzeichen) {
        Fahrzeug fahrzeug = sucheNachKennzeichen(kennzeichen);
        if (fahrzeug == null) {
            System.out.println("Fahrzeug nicht gefunden");
        } else if (!fahrzeug.getMietstatus()) {
            System.out.println("Fahrzeug ist noch verfügbar");
            System.out.println("Willst du das Fahrzeug mieten?0 = nein, 1 = ja");
            int eingabe = scanner.nextInt();
            if (eingabe == 1) {
                fahrzeug.setMietstatus(true);
                System.out.println("Fahrzeug wurde gemietet");
                System.out.println("Preis pro Tag: " + fahrzeug.berechneMietPreisProTag() + "CHF");
                System.out.println("Versicherungsprämie: " + fahrzeug.berechneVersicherungsPraemie());
            } else if (eingabe == 0) {
                System.out.println("Fahrzeug wurde nicht vermietet.");
            } else {
                System.out.println("Ungültige Eingabe");
            }
        } else {
            System.out.println("Fahrzeug ist schon vergeben");
            System.out.println("Willst du das Fahrzeug zurück geben?0 = nein, 1 = ja");
            int eingabe = scanner.nextInt();
            if (eingabe == 1) {
                fahrzeug.setMietstatus(false);
                System.out.println("Fahrzeug wurde zurück gegeben");
            } else if (eingabe == 0) {
                System.out.println("Fahrzeug wurde behalten");
            }else {
                System.out.println("Ungültige Eingabe");
            }
        }

        return false;
    }

    public Fahrzeug sucheNachKennzeichen(String gesuchtesKennzeichen) {
        for (Fahrzeug fahrzeug : fahrzeugList) {
            if (fahrzeug.getKennzeichen().equalsIgnoreCase(gesuchtesKennzeichen)) {
                return fahrzeug;
            }
        }
        return null;
    }
}
