/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1_verifica_filab;

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
        System.out.println("Backup 2 iniziato");
    }
}
