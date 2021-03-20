/* clase principal que posee el metodo main */
package Gas;

import java.util.Scanner; //Importamos la libreria Scanner para leer datos por teclado

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);//Variable que recibirá los datos de entrada
                
        System.out.println("Bienvenido a la gasolinera");
        
        System.out.println("¿Cuantos galones de gasolina deseas cargar: ?");
        int galones = leer.nextInt();
        
        
        System.out.println("Ingrese el costo por galon de gasolina: ");
        double costo = leer.nextDouble();
        
        Operaciones op1 = new Operaciones(galones, costo);//Instanciamiento de la clase Operaciones
        
        
        System.out.println("El total de litros cargados son: " + op1.getLitrosCargados()); //Mostramos litros cargados
        System.out.println("El costo por litro es: " + op1.getCostoLitros()); //Mostramos costo por litro cargado
        System.out.println("El total a pagar por los litros cargados es: " + op1.getTotal()); //Total a pagar
        
    }
    
}
