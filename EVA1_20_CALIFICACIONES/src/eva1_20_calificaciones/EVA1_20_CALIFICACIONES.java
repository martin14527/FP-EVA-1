/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_calificaciones;

import java.util.Scanner;

/**
 *
 * @author MGVL
 */
public class EVA1_20_CALIFICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int califacacion;

        System.out.println("¿Cuál es tu calificación? (0-100)");
        califacacion = input.nextInt();
        if (califacacion >= 90 && califacacion <= 100) {
            System.out.println("En un sistema gringo tu calificación sería: A");
        } else if (califacacion >= 80 && califacacion <= 89) {
            System.out.println("En un sistema gringo tu calificación sería: B");
        } else if (califacacion>= 70 && califacacion <= 79) {
            System.out.println("En un sistema gringo tu calificación sería: C");
        } else if (califacacion >= 60 && califacacion <= 69) {
            System.out.println("En un sistema gringo tu calificación sería: D");
        } else if (califacacion >= 0 && califacacion <= 59) {
            System.out.println("En un sistema gringo tu calificación sería: F");
        } else {
            System.out.println("Calificación no aceptada, tu sacaste del 0-100");
        }
    }
}
