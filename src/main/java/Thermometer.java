class Thermometer {
    private int temperatur;
    private int akkustand;
    private int ID;

    public Thermometer(int temperatur, int akkustand, int ID) {
        this.temperatur = temperatur;
        this.akkustand = akkustand;
        this.ID = ID;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public int getAkkustand() {
        return akkustand;
    }

    public int getID() {
        return ID;
    }
}