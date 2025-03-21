import java.util.List;
import java.util.ArrayList;

class Raum {
    private int raumId;
    private int zieltemperatur;
    private List<Fenster> fensterListe;
    private List<Heizung> heizungListe;
    private Thermometer thermometer;

    public Raum(int raumId, int zieltemperatur, int startTemperatur) {
        this.raumId = raumId;
        this.zieltemperatur = zieltemperatur;
        this.fensterListe = new ArrayList<>();
        this.heizungListe = new ArrayList<>();
        this.thermometer = new Thermometer(startTemperatur, 100, raumId);
    }

    public boolean hatOffeneFenster() {
        for (Fenster fenster : fensterListe) {
            if (fenster.isOffen()) {
                return true;
            }
        }
        return false;
    }

    public void regeleTemperatur() {
        if (hatOffeneFenster()) {

            for (Heizung heizung : heizungListe) {
                heizung.schalteAus();
            }
        } else {

            if (thermometer.getTemperatur() < zieltemperatur) {
                for (Heizung heizung : heizungListe) {
                    heizung.schalteEin();
                }
            } else {
                for (Heizung heizung : heizungListe) {
                    heizung.schalteAus();
                }
            }
        }
    }

    public List<Fenster> getFensterListe() {
        return fensterListe;
    }

    public List<Heizung> getHeizungListe() {
        return heizungListe;
    }

    public int getZieltemperatur() {
        return zieltemperatur;
    }

    public void setZieltemperatur(int temperatur) {
        this.zieltemperatur = temperatur;
        regeleTemperatur();
        }

    public void addFenster(Fenster fenster) {
        this.fensterListe.add(fenster);
    }

    public void addHeizung(Heizung heizung) {
        this.heizungListe.add(heizung);
    }

    public String toString() {
        return "Raum " + raumId + ": " + zieltemperatur + "°C. Fenster: " + fensterListe.size() + ". Heizungen: " + heizungListe.size();
    }
}