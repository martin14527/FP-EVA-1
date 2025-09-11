
package eva1_13_ifs;

import java.util.Scanner;


public class EVA1_13_IFS {

    public static void main(String[] args) {
    
    int edad;
    int fechan;
    System.out.println("introduce tu año de nacimiento (0-100)");
    Scanner input= new Scanner(System.in);
    fechan = input.nextInt(); //captura de texto
    edad=2025-fechan;
   if(edad >= 18) 
   {System.out.println("eres mayor de edad puedes,  comprar kosako 🍶"); }
   {System.out.println("eres menor de edad, aqui tienes una lecha santa clara 🥛");}
}  // cierre
 }  // cierre de clase
    

