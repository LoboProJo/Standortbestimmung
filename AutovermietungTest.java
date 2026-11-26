import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AutovermietungTest {
    ArrayList<Fahrzeug> fahrzeugList = new ArrayList<>();
    Autovermietung autovermietung = new Autovermietung();
    @org.junit.jupiter.api.Test
    void fahrzeugHinzufuegen() {
        Auto auto = new Auto(6,true,"ZH 172834");
        autovermietung.fahrzeugHinzufuegen(auto);
        assertEquals(auto, autovermietung.sucheNachKennzeichen("ZH 172834"));
    }

    @org.junit.jupiter.api.Test
    void alleFahrzeugeAnzeigen() {
        autovermietung.fahrzeugHinzufuegen(new Auto(6,true,"ZH 172834"));
        autovermietung.fahrzeugHinzufuegen(new Boot(2,false,"ZH 310"));
        assertDoesNotThrow(()-> autovermietung.alleFahrzeugeAnzeigen());
    }
    

    @org.junit.jupiter.api.Test
    void sucheNachKennzeichen() {
        Auto auto = new Auto(6,true,"ZH 172834");
        autovermietung.fahrzeugHinzufuegen(auto);
        assertEquals(auto, autovermietung.sucheNachKennzeichen("ZH 172834"));
    }
}