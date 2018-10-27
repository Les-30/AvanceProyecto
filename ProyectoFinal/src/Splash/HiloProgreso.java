/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Splash;
import javax.swing.JProgressBar;
/**
 *
 * @author Equipo chidoris
 */
public class HiloProgreso extends Thread {
JProgressBar progreso;
     
    public HiloProgreso(JProgressBar progreso1){
        super();
        this.progreso=progreso1;
       
            }
    public void run(){
            for (int i = 1; i<= 100; i++){
                progreso.setValue(i);
                pausa(100);
        
                
                
        }
    }

    private void pausa(int mlSeg) {
       try{
           Thread.sleep(mlSeg);          
       }
       catch(Exception e){}
    }
}