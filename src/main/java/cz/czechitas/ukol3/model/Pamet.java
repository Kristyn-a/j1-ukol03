package cz.czechitas.ukol3.model;

public class Pamet {
    private Long kapacitaPameti;


    public void kapacitaPameti (Long kapacitaPameti){

        this.kapacitaPameti = kapacitaPameti;
    }

    public Long getKapacitaPameti() {
        return kapacitaPameti;
    }

    public void setKapacitaPameti(Long kapacitaPameti) {

        this.kapacitaPameti = kapacitaPameti;
    }

    @Override
    public String toString() {
        return "kapacitaPameti" + kapacitaPameti;
    }
}
