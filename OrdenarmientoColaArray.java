


import java.util.Scanner;


public class OrdenarmientoColaArray {

    public static <T extends Comparable<T>> Cola<T> ordenarCola(Cola<T> cola){
        Cola<T> colaOrdenada = new Cola<T>();
        while(!cola.isEmpty()){
            T minElement = cola.dequeue();

            Cola<T> colaAuxiliar = new Cola<T>();

            while(!cola.isEmpty()){
                T current = cola.dequeue();
                if(current.compareTo(minElement) < 0){
                    colaAuxiliar.enqueue(minElement);
                    minElement = current;
                }else{
                    colaAuxiliar.enqueue(current);
                }
            }

            colaOrdenada.enqueue(minElement);
            while(!colaAuxiliar.isEmpty()){
                cola.enqueue(colaAuxiliar.dequeue());
            }
        }

        return colaOrdenada;
    }

    public static void main(String[] args) {
        char seguir = ' ';
        int numero = 0, contador = 0;
        Cola<Integer> cola = new Cola<Integer>();
        Cola<Integer> colaOriginal = new Cola<Integer>();
        Scanner console = new Scanner(System.in);
        do{
            contador++;
            System.out.println("Ingrese un numero para agregar a la cola");
            numero = console.nextInt();
            cola.enqueue(numero);
            colaOriginal.enqueue(numero);
            System.out.println("Quiere seguir agregando numeros ? y/n");
            seguir = console.next().charAt(0);
        }while(seguir == 'y' || seguir == 'Y');
        
        cola = ordenarCola(cola);
        System.out.println("Cola original: ");
        if(!colaOriginal.isEmpty()){
        for(int j=0;j<contador;j++)
            System.out.println(colaOriginal.dequeue());
        }
        System.out.println("Cola ordenada");
        for(int i=0;i<contador;i++)
            System.out.println(cola.dequeue());
        console.close();
    }
}
