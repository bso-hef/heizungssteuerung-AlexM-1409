import java.util.List;
import java.util.ArrayList;

class Raum {
    private int raumId;
    private int zieltemperatur;

    private List<Fenster> fensterListe = new ArrayList<>();

    private List<Heizung> heizungListe = new ArrayList<>();

    private Thermometer;


    public Raum(int raumId, int zieltemperatur) {
        this.raumId = raumId;
        this.zieltemperatur = zieltemperatur;
    }

    public boolean hatOffeneFenster() {
        for (Fenster fenster : fensterListe) {
            if (fenster.isOffen()) {
                return true;
            }
        }
        return false;
    }

    public void regeleTemperatur(){
        if
    }

    public List <Fenster> getFensterliste()

}
