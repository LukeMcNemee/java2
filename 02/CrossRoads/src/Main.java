/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukemcnemee
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        CrossRoad c1 = new CrossRoad();
        c1.show();
        while(true){
            Thread.sleep(5000);
            c1.change();
            c1.show();
        }
    }
    
}
