
package ipc1.proyecto2;

/**
 *
 * @author Moreira Paz
 */
public class Producto {
     public int id;
     public String nombre;
     public String descripcion;
     public double precio;
     public int existencia;
     public String Imagen;
     
     static int contador =1;
     
     public Producto(){
         id = Producto.contador++;
     }
}
