/*
 * Proyecto UD5 - Archivo EjerFunciones11.java - Companía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package ud5EjerciciosFunciones;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guilló <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 22 nov. 2021 13:31:57
 */
/*
11.Realiza   un   programa   que   escriba   la   tabla   de   multiplicar   de   un   número   introducido   por
teclado. Para ello implementa una función que reciba como parámetro un número entero
y muestre por pantalla la tabla de multiplicar de dicho número.
*/
public class EjerFunciones11 {
    public static String multiplicador(int num) {
        
        for (int i = 0; i <= 10; i++) {
            int mult = i * num;
            System.out.println(i + " x " + num + ": " + mult);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        
        System.out.print("Escribe el número: ");
        num = in.nextInt();
        
        System.out.println(multiplicador(num));
    }
}
