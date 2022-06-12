package cz.czechitas.ukol3.model;

public class Pocitac {

  private Procesor cpu;
  private  Pamet ram;
  private Disk pevnyDisk;
  private boolean jeZapnuty;


  public void vytvorSouborOVelikosti (long velikost) {
    if (jeZapnuty()) {
      if (velikost > (pevnyDisk.getKapacitaDisku() - getPevnyDisk().getVyuziteMistoDisku())){
        System.err.println("Soubor se na disk nevejde.");
      } else {
        pevnyDisk.setVyuziteMistoDisku(pevnyDisk.getVyuziteMistoDisku() + velikost);
        System.out.println("Přidal jsem soubor na disk, jeho aktuální využitá kapacite je:" + pevnyDisk.getVyuziteMistoDisku());
      }
    }
  }

  public boolean jeZapnuty() {
    return jeZapnuty;
  }

  public void vymazSouborOVelilkosti (long velikost){
    if (jeZapnuty) {
      if (velikost > pevnyDisk.getVyuziteMistoDisku()) {
        System.err.println("Takto velký soubor se na disku nenachází.");
      } else  {
        pevnyDisk.setVyuziteMistoDisku(pevnyDisk.getVyuziteMistoDisku() - velikost);
        System.out.println("Odstranil jsem soubor z disku, jeho aktuální využitá kapacita je:" + pevnyDisk.getVyuziteMistoDisku());
      }
    }
  }

  public void zapniSe (){
    if (cpu == null || ram == null || pevnyDisk == null ){
      System.err.println(" Počítač nemá všechny součásti.");
    } else if (jeZapnuty()) {
      System.err.println("Počítač je již zapnutý.");
    } else {
      jeZapnuty = true;
      System.out.println("Počítač se zapnul.");
    }
  }

  public void vypniSe(){
    if (jeZapnuty()) {
      jeZapnuty = false;
      System.out.println("Počítač se vypnul.");
    }
  }
  public Procesor getCpu() {
    return cpu;
  }

  public void setCpu(Procesor cpu) {
    this.cpu = cpu;
  }

  public Pamet getRam() {
    return ram;
  }

  public void setRam(Pamet ram) {
    this.ram = ram;
  }

  public Disk getPevnyDisk() {
    return pevnyDisk;
  }

  public void setPevnyDisk(Disk pevnyDisk) {
    this.pevnyDisk = pevnyDisk;
  }

  @Override
  public String toString() {
    return "Pocitac{" +
            "cpu=" + cpu +
            ", ram=" + ram +
            ", pevnyDisk=" + pevnyDisk +
            ", jeZapnuty=" + jeZapnuty +
            '}';
  }
}
