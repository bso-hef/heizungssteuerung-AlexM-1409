public class Fenster {
    private boolean offen;

    private Raum raum;

    public Fenster(Raum raum, boolean offen) {
        this.raum = raum;
        this.offen = offen;
    }

    public void offeneFenster() {
        this.offen = true;
    }

    public void schliesseFenster() {
        this.offen = false;
    }

    public boolean isOffen() {
        return this.offen;
    }

    public Raum getRaum() {
        return raum;
    }

}
