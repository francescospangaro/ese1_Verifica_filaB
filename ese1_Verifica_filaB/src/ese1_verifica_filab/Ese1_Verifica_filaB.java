/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1_verifica_filab;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author spangaro_francesco
 */
public class Ese1_Verifica_filaB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            // TODO code application logic here
            String partenza;
            partenza = "";
            Scanner input = new Scanner(System.in);
            java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            DatiCondivisi dati = new DatiCondivisi();
            ThComputer1 thcomputer1 = new ThComputer1(dati);
            ThComputer2 thcomputer2 = new ThComputer2(dati);
            ThBackup1 thbackup1 = new ThBackup1(dati);
            ThBackup2 thbackup2 = new ThBackup2(dati);
            
            while (!(partenza.equals("p"))) {
                System.out.println("Premi 'p' per far partire i computer");
                partenza = console.readLine();
                if (!(partenza.equals("p"))) {
                    System.out.println("Errore, inserisci la lettera p");
                }
            }
            
            thcomputer1.start();
            thcomputer2.start();
            
            while (!(partenza.equals("s"))) {
                System.out.println("Premi 's' per far partire il backup del computer 1");
                partenza = console.readLine();
                if (!(partenza.equals("s"))) {
                    System.out.println("Errore, inserisci la lettera s");
                }
            }
            
            thbackup1.start();
            
            partenza = " ";
            
            while (!(partenza.equals("s"))) {
                System.out.println("Premi 's' per far partire il backup del computer 2");
                partenza = console.readLine();
                if (!(partenza.equals("s"))) {
                    System.out.println("Errore, inserisci la lettera s");
                }
            }
            
            thbackup2.start();
            
            thcomputer1.join();
            thcomputer2.join();
            thbackup1.join();
            thbackup2.join();
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Ese1_Verifica_filaB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   

}
