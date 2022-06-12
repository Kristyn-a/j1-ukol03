package cz.czechitas.ukol3.model;

public class Procesor {

    private String vyrobceProcesoru;
    private long rychlostProcesoru;

    public String getVyrobceProcesoru() {
        return vyrobceProcesoru;
    }

    public void setVyrobceProcesoru(String vyrobceProcesoru) {
        this.vyrobceProcesoru = vyrobceProcesoru;
    }

    public long getRychlostProcesoru() {
        return rychlostProcesoru;
    }

    public void setRychlostProcesoru(long rychlostProcesoru) {
        this.rychlostProcesoru = rychlostProcesoru;
    }

    @Override
    public String toString() {
        return "vyrobceProcesoru" + vyrobceProcesoru + " rychlostProcesoru" + rychlostProcesoru;
    }
}
