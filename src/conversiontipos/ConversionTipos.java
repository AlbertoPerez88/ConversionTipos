/*
Vamos a solicitar al usuario pasar de un string a un entero
*/

package conversiontipos;

import java.util.Scanner;



/**
 *
 * @author Alumno Mañana
 */
public class ConversionTipos {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
        //Instanciar una variable en clase escaner
        Scanner lectura = new Scanner(System.in);
        
        //Solicitamos por teclado el numero entero
        System.out.println("Introduce el numero entero que quieras que se muestre:");
        
        //Convierto el String a tipo entero
        int entero = Integer.parseInt(lectura.nextLine());
        
        //Muestro el resultado por pantalla
        System.out.println("El entero que has tecleado es -> " + entero);
        
      
        
    }
    
    public static void notas(){
        
    }
}
