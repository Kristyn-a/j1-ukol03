package cz.czechitas.ukol3.model;

public class Procesor {

    private String vyrobceProcesoru;

    private Long rychlostProcesoru;

    public void nastaveniProcesoru (String vyrobceProcesoru, Long rychlostProcesoru){
        this.vyrobceProcesoru = vyrobceProcesoru;
        this.rychlostProcesoru = rychlostProcesoru;
    }

    public String getVyrobceProcesoru() {
        return vyrobceProcesoru;
    }

    public void setVyrobceProcesoru(String vyrobceProcesoru) {
        this.vyrobceProcesoru = vyrobceProcesoru;
    }

    public Long getRychlostProcesoru() {
        return rychlostProcesoru;
    }

    public void setRychlostProcesoru(Long rychlostProcesoru) {
        this.rychlostProcesoru = rychlostProcesoru;
    }

    @Override
    public String toString() {
        return "vyrobceProcesoru" + vyrobceProcesoru + " rychlostProcesoru" + rychlostProcesoru;
    }
}
