/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_metodos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_7_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setnombre ("Juan");
        perso.setapellido ("Perez");
        perso.setedad (50);
        
        System.out.println("El nombre es" + perso.generarnombrecom());
        System.out.println("Nacio en el año" + perso.calcularannionac());
        
        Persona[] grupo = new Persona[5];
        //para los arreglos de objetos hay que crear cada objeto
        for (int i = 0; i < grupo.length; i++) {
            Scanner input = new Scanner(System.in);
           
            //creado el objeto se llena
            System.out.println("introduce el nombre");
            String nombre = input.nextLine();
            grupo[i].setnombre(nombre);
            
            System.out.println("introduce el apellido");
            String ape = input.nextLine();
            grupo[i].setapellido(ape);
            
            System.out.println("introduce la edad");
            int edad = input.nextInt();
            grupo[i].setedad(edad);
        
            for (int j = 0; j < grupo.length; j++) {
                System.out.println("El nombre es" + grupo[i].generarnombrecom());
                System.out.println("Nacio en el año" + grupo[i].calcularannionac());
                
            }
                    
            
        }
    }
    
}
