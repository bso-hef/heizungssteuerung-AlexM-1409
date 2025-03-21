import java.util.List;
import java.util.ArrayList;

class Fenster {
    private boolean offen;
    private Raum raum;

    public Fenster(Raum raum) {
        this.raum = raum;
        this.offen = false;
    }

    public void oeffneFenster() {
        this.offen = true;
        raum.regeleTemperatur();
    }

    public void schliesseFenster() {
        this.offen = false;
        raum.regeleTemperatur();
    }

    public boolean isOffen() {
        return this.offen;
    }

    public Raum getRaum() {
        return raum;
    }
}