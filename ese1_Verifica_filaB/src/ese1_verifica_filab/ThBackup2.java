/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1_verifica_filab;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author spangaro_francesco
 */
public class ThBackup2 extends Thread{
    DatiCondivisi ptrDati;

    public ThBackup2(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }

    @Override
    public void run(){
        Random rand = new Random();
        int pausa = rand.nextInt(1000)+1;
        pausa += 1000;
        System.out.println("Backup 2 iniziato");
        try {
            Thread.sleep(pausa);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThBackup1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Backup 2 finito");
        ptrDati.signalOffPc2();
    }
}
