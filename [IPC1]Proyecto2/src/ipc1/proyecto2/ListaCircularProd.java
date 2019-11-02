
package ipc1.proyecto2;

/**
 *
 * @author Moreira Paz
 */
public class ListaCircularProd {
    
    NodoProducto inicio;
    NodoProducto fin;
    static int size;
    
    public ListaCircularProd(){
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
    
    public void insertar(Producto p){
        NodoProducto nodo= new NodoProducto(p);
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
    
    
    public void modificar(int id, Producto P){
        NodoProducto actual;
        actual = inicio;
        do{
            if(actual.producto.id==id){
                actual.producto=P;
            }
            actual = actual.siguiente;
        }while(actual!=inicio);
        
    }
    
    public Producto buscar(int id){
        
        if(estaVacio()){
            return null;
        }
        else{
        NodoProducto aux= inicio;
        do{
            if(aux.producto.id==id){
             return aux.producto;   
            }
            aux = aux.siguiente;
        }while(aux!=inicio);
    }
        return null;
    }

    
    public void eliminar(int id){
        
        NodoProducto actual= inicio;
        NodoProducto anterior = null;
        size--;
        
        if(inicio!=null){
            
            while((actual!=null)&&(actual.producto.id!=id)){
            anterior = actual;
            actual = actual.siguiente;
            }
            if((actual==null)||id!=actual.producto.id){
                System.out.println("NO EXISTE");
            }
            else{
                if(actual == inicio){
                    inicio = inicio.siguiente;
                    fin.siguiente = inicio;
                    actual.siguiente=null;
                }
                else if(actual == fin){
                    anterior.siguiente = fin.siguiente;
                    fin = anterior;
                    actual.siguiente = null;
                }
                else{
                    anterior.siguiente = actual .siguiente;
                    actual.siguiente =null;
                }
            }
            
        }
        else{
            System.out.println("NO HAY");
        }
        
    }
    
}
