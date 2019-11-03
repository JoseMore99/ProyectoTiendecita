
package ipc1.proyecto2;

/**
 *
 * @author Moreira Paz
 */
public class ListaColaOfer {
    NodoOferta cabeza;
    static int size=0;
    
    public ListaColaOfer(){
        cabeza=null;
    }
    
    public int tamaño(){
        return size;
    }
    
    public void insertar(oferta OF){
        size++;
        NodoOferta actual = new NodoOferta(OF);
        if(cabeza == null){
            cabeza = actual;
        }else{
            NodoOferta temporal = cabeza;
            while(temporal.siguiente!=null){
                temporal = temporal.siguiente;
            }
            temporal.siguiente=actual;
        }
    }
    
    public void eliminar(){
        cabeza = cabeza.siguiente;
        size--;
    }
    
}
