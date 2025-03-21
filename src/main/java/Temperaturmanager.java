import java.util.List;
import java.util.ArrayList;

public class Temperaturmanager {
    private List<Raum> raeume;

    public Temperaturmanager() {
        this.raeume = new ArrayList<>();
    }

    public void regeleTemperatur() {
        for (Raum raum : raeume) {
            raum.regeleTemperatur();
        }
    }

    public void erstelleRaeume() {
        Raum raum1 = new Raum(1, 20, 18);
        raum1.addFenster(new Fenster(raum1));
        raum1.addFenster(new Fenster(raum1));
        raum1.addHeizung(new Heizung(raum1));
        raum1.addHeizung(new Heizung(raum1));

        Raum raum2 = new Raum(2, 20, 19);
        raum2.addFenster(new Fenster(raum2));
        raum2.addFenster(new Fenster(raum2));
        raum2.addHeizung(new Heizung(raum2));
        raum2.addHeizung(new Heizung(raum2));

        raeume.add(raum1);
        raeume.add(raum2);
    }
}