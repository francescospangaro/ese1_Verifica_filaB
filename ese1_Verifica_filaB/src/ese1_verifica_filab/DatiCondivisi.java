/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1_verifica_filab;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author spangaro_francesco
 */
public class DatiCondivisi {
    Semaphore startpc;
    Semaphore startbackup;
    Semaphore offPc1;
    Semaphore offPc2;

    public DatiCondivisi() {
        Semaphore startpc = new Semaphore(0);
        Semaphore startbackup = new Semaphore(0);
        Semaphore offPc1 = new Semaphore(0);
        Semaphore offPc2 = new Semaphore(0);
    }
    
    public void waitStartPc(){
        try {
            startpc.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitStartBackup(){
        try {
            startbackup.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitoffPc1(){
        try {
            offPc1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitOffPc2(){
        try {
            offPc2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
