package eva1_21_operaciones_math;
//MGVL
public class EVA1_21_OPERACIONES_MATH {

    public static void main(String[] args) {
        int valor = 2, expo = 3;
        double resultado;
        resultado = Math.pow(valor, expo);
        System.out.print("2 al cubo = ");
        System.out.println(resultado);

        // RAÍZ CUADRADA
        int valor2 = 100;
        double resu2;
        resu2 = Math.sqrt(valor2);
        System.out.print("Raíz cuadrada de 100 = ");
        System.out.println(resu2);

        // OTRAS RAÍCES (raíz cúbica de 125)
        int valor3 = 125;
        double resu3;
        resu3 = Math.pow(valor3, 1.0 / 3.0);
        System.out.print("La raíz cúbica de 125 = ");
        System.out.println(resu3);

        // DIVISIÓN ENTRE ENTEROS
        System.out.print("7 / 3 = ");
        System.out.println(7.0 / 3.0); 

        // DIVISIÓN EXACTA CON RESIDUO
        int num1 = 2024, num2 = 4;
        int residuo;
        residuo = num1 % num2; // cálculo de residuo
        System.out.print("2024 / 4, el residuo es: ");
        System.out.println(residuo);
    }
}
