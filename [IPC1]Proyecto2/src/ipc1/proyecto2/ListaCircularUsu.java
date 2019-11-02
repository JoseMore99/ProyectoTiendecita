
package ipc1.proyecto2;

/**
 *
 * @author Moreira Paz
 */
public class ListaCircularUsu {
    
     NodoUsuario inicio;
    NodoUsuario fin;
    int size;
    
    public ListaCircularUsu(){
        inicio = null;
        fin = null;
        size=0;
    }
    
    public boolean estaVacio(){
        return size==0;
    }
    
    public int tamaño(){
        return size;
    }
    
    public void insertar(Usuario u){
        NodoUsuario nodo= new NodoUsuario(u);
        size++;
             if(inicio==null){
             inicio = nodo;
             fin = nodo;
             }
             else{
                 fin.siguiente=nodo;
                 fin = nodo;
                 fin.siguiente = inicio;
             }
    }
    
    
    
    
   public Usuario buscar(String usuario){
        
        if(estaVacio()){
            return null;
        }
        else{
        NodoUsuario aux= inicio;
        do{
            if(aux.usuario.nusuario==usuario){
             return aux.usuario;   
            }
            aux = aux.siguiente;
        }while(aux!=inicio);
    }
        return null;
    }
     
    public void eliminar(String usurio){
        
        NodoUsuario temporal= inicio;
        do{
            if(temporal.siguiente.usuario.nusuario==usurio){
               temporal = temporal.siguiente.siguiente;
            }
            temporal = temporal.siguiente;
        }while(temporal!=inicio);
        inicio =temporal;
    }
    
    
}
