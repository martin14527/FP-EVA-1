/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;

import java.util.Scanner;

/**
 *
 * @author 52614
 */
public class EVA1_14_DESCUENTO {

    public static void main(String[] args) {
    double precio1,precioT;
    Scanner input = new Scanner(System.in);
    System.out.println("cual es el precio del producto? "); 
    precio1 = input.nextDouble();
    precioT=precio1*.85;
     if (precio1>1000) {
            System.out.println("tu tienes un descuento del 15%----> "); 
      System.out.print(precioT);} 
        else{System.out.print("tu precio es ----> ");
            System.out.print(precio1);}
    }
    
}
