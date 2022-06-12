package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacitaDisku;
    private long vyuziteMistoDisku;

    public long getKapacitaDisku() {
        return kapacitaDisku;
    }

    public void setKapacitaDisku(long kapacitaDisku) {
        this.kapacitaDisku = kapacitaDisku;
    }

    public long getVyuziteMistoDisku() {
        return vyuziteMistoDisku;
    }

    public void setVyuziteMistoDisku(long vyuziteMistoDisku) {
        this.vyuziteMistoDisku = vyuziteMistoDisku;
    }

    @Override
    public String toString() {
        return "Disk" + "kapacitaDisku=" + kapacitaDisku + "vyuziteMistoDisku=" + vyuziteMistoDisku;
    }
}
