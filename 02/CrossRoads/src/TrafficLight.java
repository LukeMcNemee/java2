/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukemcnemee
 */
public class TrafficLight {

    private boolean status;

    public TrafficLight(boolean status) {
        this.status = status;

    }

    public void switchLight() {
        if (status) {
            status = false;
        } else {
            status = true;
        }
        ///////
        status = !status;
    }

// return "1";  return "0";
    public String getLight() {
        if (status) {
            return "1";
        } else {
            return "0";
        }
    }
}
