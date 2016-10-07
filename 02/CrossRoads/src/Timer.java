
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukemcnemee
 */
public class Timer {
    public CrossRoad crossRoad;

    public Timer() {
        crossRoad = new CrossRoad();
    }
    
    
    public void startTimer(int iterations){
        for(int i = 0; i < iterations*2; i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
            crossRoad.change();
            crossRoad.show();
        }
    }
    
}
