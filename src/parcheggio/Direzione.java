/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcheggio;
import java.util.concurrent.Semaphore;
/**
 *
 * @author Alessandro
 */

public class Direzione {
    public static Semaphore ingresso = new Semaphore(1);
    public static Semaphore uscita = new Semaphore(0);
    public static int PostiDisponibili = 10;
    //public static boolean sbarre = false;
}
