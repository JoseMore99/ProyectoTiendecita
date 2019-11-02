package contenedor;
//Importacion de libreria Scanner para capturar el teclado
import java.util.Scanner;

public class ClasePrincipal {
    //Metodo principal que se ejecutara al correr la aplicacion
    public static void main(String[] args){
        //Se imprime un mensaje en pantalla para indicar el inicio de la aplicacion
        System.out.println("***   INCIO DEL PROGRAMA   ***");
        //Inicializacion de variables de tipo entero ya que son numeros
        int a = 0;
        int b = 0;
        //Ciclo do-while utilizado para validar que los dos numeros sean diferentes
        do{
            //Variable de la clase Scanner que se utilizará para capturar el valor ingresado por el usuario
            Scanner lectura = new Scanner(System.in);
            //Mensaje con instrucciones para el usuario
            System.out.println("** POR FAVOR INGRESE DOS NUMEROS DIFERENTES **");
            //Solicitacitamos el primer numero al usuario
            System.out.print("INGRESE EL PRIMER NUMERO: ");
            //Capturamos el numero y lo asignamos en la variable a
            a = lectura.nextInt();
            //Solicitamos el segundo numero al usuario
            System.out.print("INGRESE EL SEGUNDO NUMERO: ");
            //Capturamos el numero y lo asignamos en la variable b
            b = lectura.nextInt();
        }while(a == b ); 
        //Si comprobacion para saber si el primer numero "a" es mayor al segundo numero "b"
        if(a>b)
            System.out.println("El numero mayor es a " + a);
        //De lo contrario el numero "b" es mayor que "a"
        else
            System.out.println("El numero mayor es b " + b);
        //Mensaje para indicar el final de ejecucion de la aplicacion
        System.out.println("***   FIN DEL PROGRAMA   ***");
    }
}
