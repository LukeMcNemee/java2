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
    public static void main(String[] args) {
        
        triangle(3);
        System.out.println("");
        fullSquare(4);
        System.out.println("");
        square(4);
        System.out.println("");
        crossSquare(11);
        
    }
    
    
    /* n = 3
    #
    ##    
    ###
    */
    public static void triangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n- i  ; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    
     /* n = 4
    ####
    ####
    ####
    #### 
    */
    public static void fullSquare(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    
    
    /* n = 4
    ####
    #  #
    #  #
    #### 
    */
    public static void square(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n-1 || j == 0 || j == n-1 || i==j  ){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
     /* n = 5 
    #####
    ## ##
    # # #
    ## ## 
    #####
    */
    public static void crossSquare(int n){
         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n-1 || j == 0 || j == n-1 || i == j || i == n-j-1){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    
          
}
