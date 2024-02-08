/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1.pkg2.intanciacion;

/**
 *
 * @author invitado
 */
public class EVA12INTANCIACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 100;
        //intanciacion
        //clase identificador = new contructor();
        //contructor --> metodo con el mismo nombre que la clase.
        Persona perso1 = new Persona(); //intanciacion
        System.out.println(perso1);
        //perso1 --> referencia --> direcion en memoria
        Vehiculo mamalon = new Vehiculo();
        System.out.println(mamalon);
                
              
    }
    
}
//tipo de dato abstracto
class Persona{
    
}

class vehiculo{
    //atributos
    String marca;
    int annio;
    String modelo;

}