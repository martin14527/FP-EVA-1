package eva1_19_cadenero;

import java.util.Scanner;
public class EVA1_19_CADENERO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        boolean INE;
        int edad;
        System.out.println("¿Cuál es tu edad?");
        edad = captu.nextInt();
        System.out.println("Tienes INE? (true or false)");
        INE = captu.nextBoolean();
        // Evaluamos si puede entrar: debe ser mayor de edad y tener ID
        if ((edad >= 18) && (INE == true)) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }
    }
}
