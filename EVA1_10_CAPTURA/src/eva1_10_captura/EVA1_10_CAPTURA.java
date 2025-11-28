/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double velocidad;
    double distancia;
    double tiempo;
    System.out.println("introduce la distancia");
    Scanner input= new Scanner(System.in);
    distancia = input.nextDouble();
    System.out.println("introduce el tiempo (m/s) ");
    tiempo = input.nextDouble();
    velocidad= distancia/tiempo;
    System.out.print("la velocidad es... ---> ");
    System.out.print(velocidad ); 
    System.out.print("  M/S" );
    System.out.println(" " );
          System.out.println(" " );
     }
    
}

