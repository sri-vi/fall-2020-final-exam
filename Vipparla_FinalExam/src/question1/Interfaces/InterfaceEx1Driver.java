/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.Interfaces;

/**
 *
 * @author S540791
 */
public class InterfaceEx1Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceEx1a ex=new InterfaceEx1a(4);
        System.out.println("Sum is:"+ex.sum());
        System.out.println("Multiplication is :"+ex.multiply());
        System.out.println("Subtraction is :"+ex.subtract());
        System.out.println("Invoking the display method:");
        ex.displayResults();
    }
    
}
