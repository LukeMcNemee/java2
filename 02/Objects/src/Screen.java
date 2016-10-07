/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukemcnemee
 */
public class Screen {
    private int resZ;
    private int resY;
    private String brand;

    public Screen(int resX, int resY, String brand) {
        this.resZ = resX;
        this.resY = resY;
        this.brand = brand;
    }    
    
    public int getResZ() {
        return resZ;
    }

    public void setResZ(int resZ) {
        this.resZ = resZ;
    }

    public int getResY() {
        return resY;
    }

    public void setResY(int resY) {
        this.resY = resY;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    
    public int getPixelsCount(){
        return resZ*resY;
    }
    
    public void printInfo(){
        System.out.println("Monitor by brand: "+ brand +
                ", with resolution: "+ resZ + "x" + resY);
    }
}
