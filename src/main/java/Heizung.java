public class Heizung {
    private boolean eigenschaltet;

    private Raum raum;

    public Heizung(Raum raum){
    }

    public void schalteEin(){
        this.eigenschaltet = true;
    }

    public void schalteAus(){
        this.eigenschaltet = false;
    }

    public boolean isEigenschaltet() {
        return eigenschaltet;
    }

    public Raum getRaum(){
        return raum;
    }

}
