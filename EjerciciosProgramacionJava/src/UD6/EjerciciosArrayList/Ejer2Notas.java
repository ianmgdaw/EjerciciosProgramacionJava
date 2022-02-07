/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejer2Notas.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.EjerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 9 feb. 2022 21:06:28
 */
public class Ejer2Notas {

    public static void main(String[] args) {
        
        //int nota;
        
        ArrayList<Integer> notas = new ArrayList();
        
        Scanner lector = new Scanner(System.in);
        
              
        do {
            
            System.out.print("Escribe nota: ");
            int nota = lector.nextInt();
            
            if (nota >= 0 && nota <= 10) {
                
            } else
                
            
        } while (nota != -1);
        
        
        
    }
}
