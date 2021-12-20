/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainPersona.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios1.ProgramaPersona;

import java.util.Scanner;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:13:41
 */
public class MainPersona {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Persona p1 = new Persona();

        System.out.println("Persona 1");
        System.out.print("Nombre: ");
        p1.nombre = lector.nextLine();
        System.out.print("Apellidos: ");
        p1.apellidos = lector.nextLine();
        System.out.print("Edad: ");
        p1.edad = lector.nextInt();
        lector.nextLine();
        System.out.print("DNI: ");
        p1.dni = lector.nextLine();

        Persona p2 = new Persona();

        System.out.println("");
        System.out.println("Persona 2");
        System.out.print("Nombre: ");
        p2.nombre = lector.nextLine();
        System.out.print("Apellidos: ");
        p2.apellidos = lector.nextLine();
        System.out.print("Edad: ");
        p2.edad = lector.nextInt();
        lector.nextLine();
        System.out.print("DNI: ");
        p2.dni = lector.nextLine();

        System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " " + p1.imprimirSiEsMayorEdad());
        System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + " " + p2.imprimirSiEsMayorEdad());
    }
}
