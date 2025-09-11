
package eva1_16_if_anidado;

import java.util.Scanner;

public class EVA1_16_IF_ANIDADO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repetir; // cadena para repetir

        do {
            System.out.println("Escribe un número (1-7) y te diré qué día de la semana es:");
            int numeross = input.nextInt();

            if (numeross == 1) {
                System.out.println("Escogiste el lunes");
            } else if (numeross == 2) {
                System.out.println("Escogiste el martes");
            } else if (numeross == 3) {
                System.out.println("Escogiste el miércoles");
            } else if (numeross == 4) {
                System.out.println("Escogiste el jueves");
            } else if (numeross == 5) {
                System.out.println("Escogiste el viernes, ¡hoy pagan!");
            } else if (numeross == 6) {
                System.out.println("Escogiste el sábado");
            } else if (numeross == 7) {
                System.out.println("Escogiste el domingo");
            } else {
                System.out.println("Número inválido, solo del 1 al 7");
            }
            System.out.println("¿Quieres ingresar otro número? (si/no):");
            repetir = input.next(); // capturamos la respuesta como cadena
        } while (repetir.equals("si"));

        System.out.println("fuimonos");
    }
}
