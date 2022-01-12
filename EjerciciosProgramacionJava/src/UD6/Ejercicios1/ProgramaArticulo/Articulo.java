/*
 * Proyecto EjerciciosProgramacionJava - Archivo Articulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD6.Ejercicios1.ProgramaArticulo;

/**
 *
 * @author Ian Molina Guillo <ianmg.daw@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:34:28
 */
public class Articulo {
    public String nombre;
    public double precio;
    public int iva;
    public int cuantosQuedan;
    public double pvp;
    
    public double pvp(){
        pvp = ((iva/100) * precio) + precio;
        return pvp;
    }
    
    
    public String imprimirArticulo(){
        return nombre + " - Precio:" + precio + "€ - IVA:" + iva + "% - PVP:" + pvp() + "€";
    }
    
    
    
}
