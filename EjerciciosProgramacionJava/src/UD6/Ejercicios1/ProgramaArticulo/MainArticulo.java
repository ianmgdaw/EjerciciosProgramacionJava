/*
 * Proyecto EjerciciosProgramacionJava - Archivo MainArticulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6.Ejercicios1.ProgramaArticulo;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:34:40
 */
public class MainArticulo {
    public static void main(String[] args) {
        
        Articulo art1 = new Articulo();
        
        art1.nombre = "TV";
        art1.precio = 100;
        art1.iva = 21;
        art1.cuantosQuedan = 10;
        
        System.out.println(art1.imprimirArticulo());
        
    }
}
