/*
 * 
 * Cola de Números
a. Implementa una cola que almacene números enteros. Crea un
programa que solicite al usuario ingresar números y los encole. Luego,
desencola y suma todos los números.
 */

 import java.util.Scanner;

public class ColaImplementacion {
    public static void main(String[] args) {
        char seguir = ' ';
        int numero = 0 , suma = 0, contador = 0;
        QueueList<Integer> cola = new QueueList<Integer>();
        Scanner console = new Scanner(System.in);
        do{
            contador++;
            System.out.println("Ingrese un numero para almacenar en la cola");
            numero = console.nextInt();
            cola.enqueue(numero);
            System.out.println("Quiere seguir agregando numeros ?");
            seguir = console.next().charAt(0);
        }while(seguir=='y' || seguir=='Y');
        console.close();


        for(int i=0;i<contador;i++){
            suma = suma + cola.dequeue();
        }

        System.out.println("El resultado de la suma es: " + suma);
    }
}
