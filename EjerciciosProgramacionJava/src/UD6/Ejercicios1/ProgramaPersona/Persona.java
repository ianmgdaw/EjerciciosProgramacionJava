/*
 * Proyecto EjerciciosProgramacionJava - Archivo Persona.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD6.Ejercicios1.ProgramaPersona;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:13:57
 */
public class Persona {

    public String dni;
    public String nombre;
    public String apellidos;
    public int edad;

    public String imprimirSiEsMayorEdad() {
        if (edad >= 18) {
            return "es mayor de edad.";
        } else {
            return "no es mayor de edad.";
        }
    }

}
