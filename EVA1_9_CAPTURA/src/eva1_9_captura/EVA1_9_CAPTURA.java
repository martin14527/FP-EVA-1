
package eva1_9_captura;
import java.util.Scanner;

public class EVA1_9_CAPTURA {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        System.out.println("introduce tu nombre");
        //capturar datos
        Scanner input= new Scanner(System.in);
        nombre = input.nextLine(); //captura de texto
        System.out.println("su nombre es ");
        System.out.println(nombre);
        System.out.println("introduce tu edad");
       edad = input.nextInt();
       System.out.println("captura tu promedio de preparatoria");
       promedio = input.nextDouble();
       System.out.println("su nombre es ");
       System.out.println(nombre);
        System.out.println("su edad es ");
       System.out.println(edad);
        System.out.println("su promedio es");
       System.out.println(promedio);
       
    }
    
}
