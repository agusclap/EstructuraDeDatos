import java.util.Scanner;

public class OrdenamientoCola {
    public static void main(String[] args) {
        QueueList<Integer> cola = new QueueList<Integer>();
        Scanner console = new Scanner(System.in);
        int contador = 0;
        char seguir = ' ';
        do {
            contador++;
            System.out.println("Ingrese un número para agregar a la cola:");
            int numero = console.nextInt();
            cola.enqueue(numero);
            System.out.println("¿Quiere agregar más números a la cola? (y/n)");
            seguir = console.next().charAt(0);
        } while (seguir == 'y' || seguir == 'Y');
        console.close();

        QueueList<Integer> colaOrdenada = ordenarCola(cola);

        System.out.println("Cola Ordenada:");
        while (!colaOrdenada.isEmpty()) {
            System.out.print(colaOrdenada.dequeue() + " ");
        }
    }

    public static <T extends Comparable<T>> QueueList<T> ordenarCola(QueueList<T> cola) {
        QueueList<T> colaOrdenada = new QueueList<T>();

        while (!cola.isEmpty()) {
            T minElement = cola.dequeue();
            
            QueueList<T> colaAuxiliar = new QueueList<T>();
            
            while (!cola.isEmpty()) {
                T current = cola.dequeue();
                if (current.compareTo(minElement) < 0) {
                    colaAuxiliar.enqueue(minElement);
                    minElement = current;
                } else {
                    colaAuxiliar.enqueue(current);
                }
            }
            
            colaOrdenada.enqueue(minElement);
            
            while (!colaAuxiliar.isEmpty()) {
                cola.enqueue(colaAuxiliar.dequeue());
            }
        }

        return colaOrdenada;
    }
}



