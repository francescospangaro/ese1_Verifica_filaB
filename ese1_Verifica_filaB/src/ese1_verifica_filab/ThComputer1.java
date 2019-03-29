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
public class ThComputer1 extends Thread{
    DatiCondivisi ptrDati;

    public ThComputer1(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }

    @Override
    public void run(){
        System.out.println("Computer 1 acceso");
        ptrDati.waitOffPc1();
        System.out.println("Computer 1 spento");
    }
}
