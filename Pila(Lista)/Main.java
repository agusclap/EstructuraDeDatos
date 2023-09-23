

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        StackList<Integer> pila = new StackList<Integer>();
        Scanner console = new Scanner(System.in);
        int elemento = 0;
        char opcion = ' ';
        char seguir = ' ';
        do{
            System.out.println("MENU DE OPCIONES: ");
            System.out.println("a) Agregar un elemento");
            System.out.println("b) Eliminar y mostrar elemento");
            System.out.println("c) Retornar ultimo valor agregado de la pila");
            System.out.println("d) Comprobar si la pila esta vacia");
            System.out.println("e) Vaciar la pila");
            System.out.println("f) Obtener el tamaño de la pila");
            opcion = console.next().charAt(0);
            switch(opcion){
                case 'a':
                {
                    System.out.println("Ingrese un elemento a agregar");
                
                    elemento = console.nextInt();
                    pila.push(elemento);
                    break;
                }
                case 'b':
                {
                    pila.pop();
                    break;
                }
                case 'c':
                {
                    System.out.println(pila.top());
                    break;
                }   
                case 'd':
                {
                    if(pila.isEmpty() == true)
                        System.out.println("La pila esta vacia");
                    else
                        System.out.println("La pila no esta vacia");
                    break;
                }
                case 'e':
                {
                    pila.makeEmpty();
                    break;
                }
                case 'f':
                {
                    System.out.println("Tamaño de la pila: " + pila.size());
                }
                default:
                    System.out.println("Ingrese una opcion valida");
            }
            System.out.println("Quiere continuar con el programa ? y/n");
            seguir = console.next().charAt(0);
        }while(seguir == 'Y' || seguir == 'y');
        console.close();
    }
    
}
