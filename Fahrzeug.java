public abstract class Fahrzeug implements Versicherbar {

    private int anzahlSitzplätze;
    private boolean mietstatus;
    private String kennzeichen;

    public Fahrzeug(int anzahlSitzplaetze, boolean mietstatus, String kennzeichen) {
        this.anzahlSitzplätze = anzahlSitzplaetze;
        this.mietstatus = mietstatus;
        this.kennzeichen = kennzeichen;
    }

    public abstract int berechneMietPreisProTag();

    public int getAnzahlSitzplaetze() {
        return anzahlSitzplätze;
    }

    public void setAnzahlSitzplaetze(int annzahlSitzplätze) {
        this.anzahlSitzplätze = annzahlSitzplätze;
    }

    public boolean getMietstatus() {
        return mietstatus;
    }

    public void setMietstatus(boolean mietstatus) {
        this.mietstatus = mietstatus;
    }
    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
}
