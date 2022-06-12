package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        Pocitac tynypocitac = new Pocitac();
        System.out.println(tynypocitac);
        tynypocitac.zapniSe(); //chyba nemá všechny součásti

        Disk tynyPevnyDisk = new Disk();
        tynyPevnyDisk.setKapacitaDisku(200_000_000_000L);
        tynyPevnyDisk.setVyuziteMistoDisku(100_000_000_000L);

        Pamet tynyRam = new Pamet ();
        tynyRam.setKapacitaPameti(500_000_000_000L);

        Procesor tynyCPU = new Procesor();
        tynyCPU.setVyrobceProcesoru("Intel");
        tynyCPU.setRychlostProcesoru(1_500_000_000L);

        tynypocitac.setPevnyDisk(tynyPevnyDisk);
        tynypocitac.setRam(tynyRam);
        tynypocitac.setCpu(tynyCPU);

        System.out.println("tynypocitac");
        tynypocitac.zapniSe(); //zapne se
        System.out.println("Zapnuty = " + tynypocitac.jeZapnuty()); //pro kontrolu
        tynypocitac.zapniSe(); //chyba je již zapnutý
        tynypocitac.vypniSe(); //vypne se
        System.out.println("Zapnutý = " + tynypocitac.jeZapnuty()); //pro kontrolu
        tynypocitac.vypniSe(); //nic se nestane
        System.out.println("Zapnutý = " + tynypocitac.jeZapnuty()); //pro kontrolu
    }
}
