public class Boot extends Fahrzeug implements Versicherbar{

    public Boot(int anzahlSitzplaetze, boolean mietstatus, String kennzeichen) {
        super(anzahlSitzplaetze, mietstatus, kennzeichen);
    }

    @Override
    public int berechneMietPreisProTag() {
        return 30 + getAnzahlSitzplaetze() * 5;
    }

    @Override
    public double berechneVersicherungsPraemie() {
        double praemie = 200 + getAnzahlSitzplaetze() * 0.05;
        return praemie;
    }
}
