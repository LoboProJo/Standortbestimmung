public class Auto extends Fahrzeug implements Versicherbar  {

    public Auto(int annzahlSitzplätze, boolean mietstatus,String kennzeichen ) {
        super(annzahlSitzplätze, mietstatus, kennzeichen);
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
