package eva1_15_numero.mayor_menor;

import java.util.Scanner;

public class EVA1_15_NUMEROMAYOR_MENOR {

    public static void main(String[] args) {
        double n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu primer número: ");
        n1 = input.nextDouble(); 

        System.out.println("Introduce tu segundo número: ");
        n2 = input.nextDouble(); 

        if (n1 > n2) {   /*primer if  */
            System.out.println("Tu primer número es más grande");
            System.out.println(n1);
        } else if (n1 < n2) {  /*segundo if, else iff es para evitar otro if, solo se pone la   */
            System.out.println("Tu segundo número es más grande");
            System.out.println(n2);
        } else {    /*primer if  */
            System.out.println("Los dos números son iguales");
        }
    }
}



