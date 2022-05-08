package cz.czechitas.ukol3.model;

public class Disk {
    private Long kapacitaDisku;

    private Long vyuziteMistoDisku;

    public void nastaveniDisku (Long kapacitaDisku, Long vyuziteMistoDisku){
            this.kapacitaDisku = kapacitaDisku;
            this.vyuziteMistoDisku = vyuziteMistoDisku;
    }

    public Long getKapacitaDisku() {
        return kapacitaDisku;
    }

    public void setKapacitaDisku(Long kapacitaDisku) {

        this.kapacitaDisku = kapacitaDisku;
    }

    public Long getVyuziteMistoDisku() {

        return vyuziteMistoDisku;
    }

    public void setVyuziteMistoDisku(Long vyuziteMistoDisku) {

        this.vyuziteMistoDisku = vyuziteMistoDisku;
    }

    @Override
    public String toString() {
        return "kapacitaDisku" + " bitů " + kapacitaDisku + "vyuziteMistoDisku" + " bitů " + vyuziteMistoDisku;
    }
}
