/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

/**
 *
 * @author proxc
 */
public class Project4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Runnable runnable = new Runnable() {
            @Override
            public void run() {
               new project4.Home4().setVisible(true);
               
            }
        };
        runnable.run();
    }
    
}
