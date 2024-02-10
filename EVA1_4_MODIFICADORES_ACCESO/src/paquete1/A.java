/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete1;

import paquete2.B;
import paquete2.C;

/**
 *
 * @author invitado
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        one obj1 = new one ();
        System.out.println(obj1);
        
        //clases del paquete 2
        B objB = new B();
        System.out.println(objB);
        
       //two obj2 = new two();--> no se puede usar 
        //porque no es accsesible y tiene modificador default
        
        C objC = new C();
        System.out.println(objC);
    }
    
}

class one{

}
