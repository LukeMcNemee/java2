/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukemcnemee
 */
public class CrossRoad {
    private TrafficLight left;
    private TrafficLight right;
    private TrafficLight up;
    private TrafficLight down;

    public CrossRoad() {
        left = new TrafficLight(true);
        right = new TrafficLight(true);
        up = new TrafficLight(false);
        down = new TrafficLight(false);
    }
       
    public void change(){
        left.switchLight();
        right.switchLight();
        up.switchLight();
        down.switchLight();
    }
    
    public void show(){
        System.out.println("   |   |   ");
        System.out.println("___| "+ up.getLight()+" |___");
        System.out.println("");
        System.out.println("  "+left.getLight() + "     " + right.getLight()+"  ");
        System.out.println("___     ___");
        System.out.println("   | "+ down.getLight()+" |  ");
        System.out.println("   |   |   ");
        System.out.println("");
    }
}




/*
        System.out.println("   |   |   ");
        System.out.println("___| "+ up.getLight()+" |___");
        System.out.println("");
        System.out.println("  "+left.getLight() + "     " + right.getLight()+"  ");
        System.out.println("___     ___");
        System.out.println("   | "+ down.getLight()+" |  ");
        System.out.println("   |   |   ");
        System.out.println("");
*/
