/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcheggio;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Alessandro
 */
public class Auto {
    
    
    public void run(){
        
        int t = 0;
        try {
        Direzione.ingresso.acquire();
        t = 10 - Direzione.PostiDisponibili;
        System.out.println("Posti disponibili: " + Direzione.PostiDisponibili);
        Direzione.uscita.release();
        } catch (InterruptedException e) {
            
        }
        try  {
            
            TimeUnit.SECONDS.sleep(2);
            
        }catch (InterruptedException e){
            
        }
    }
}
    

