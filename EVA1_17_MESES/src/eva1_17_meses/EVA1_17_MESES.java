/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_meses;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class EVA1_17_MESES {
public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
        String repetir;

        do {  
            System.out.println("Escribe un número (1-12) y te diré qué mes es:");
            int numeross = input.nextInt();

            if (numeross == 1) {
                System.out.println("Escogiste enero");
            } else if (numeross == 2) {
                System.out.println("Escogiste febrero");
            } else if (numeross == 3) {
                System.out.println("Escogiste marzo");
            } else if (numeross == 4) {
                System.out.println("Escogiste abril");
            } else if (numeross == 5) {
                System.out.println("Escogiste mayo");
            } else if (numeross == 6) {
                System.out.println("Escogiste junio");
            } else if (numeross == 7) {
                System.out.println("Escogiste julio");
            } else if (numeross == 8) {
                System.out.println("Escogiste agosto");
            } else if (numeross == 9) {
                System.out.println("Escogiste septiembre");
            } else if (numeross == 10) {
                System.out.println("Escogiste octubre");
            } else if (numeross == 11) {
                System.out.println("Escogiste noviembre");
            } else if (numeross == 12) {
                System.out.println("Escogiste diciembre");
            } else {
                System.out.println("Número inválido, solo del 1 al 12");
            }

            System.out.println("¿Quieres ingresar otro número? (si/no):");
            repetir = input.next();

        } while (repetir.equalsIgnoreCase("si"));

        System.out.println("Programa terminado.");
    }
}