
package eva_1_12_ifs;

import java.util.Scanner;

public class EVA_1_12_IFS {


    public static void main(String[] args) {
    double calificacion;
    System.out.println("introduce tu calificion (0-100)");
    Scanner input= new Scanner(System.in);
    calificacion = input.nextDouble(); //captura de texto
   if(calificacion >= 70) 
   {System.out.println("si pasaste la materia"); } 
   else
   {System.out.println("no pasaste la carrera");}
}  // cierre
    }// cierre de clase
    

