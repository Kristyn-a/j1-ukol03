package cz.czechitas.ukol3.model;

public class Pocitac {

  private Procesor cpu;
  private  Pamet ram;
  private Disk pevnyDisk;

  public Boolean jeZapnuty;
  public Pocitac zapniSe (Procesor cpu, Pamet ram, Disk pevnyDisk){
    if (cpu.)

    this.cpu = cpu;
    this.ram = ram;
    this.pevnyDisk = pevnyDisk;
  }

//  public void vypniSe();


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

}
