import java.util.Scanner;

public class PalindromoCola {

    public static void main(String[] args) {
        QueueList<Character> cola = new QueueList<Character>();
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese una palabra para verificar si es palíndromo:");
        String palabra = console.next().toLowerCase(); // Convierte la palabra a minúsculas para ser insensible a mayúsculas/minúsculas
        boolean esPalindromo = true;

        for (int i = 0; i < palabra.length(); i++) {
            cola.enqueue(palabra.charAt(i));
            
        }
        for (int j = 0; j < palabra.length(); j++) {
            if (!cola.dequeue().equals(palabra.charAt(palabra.length()-1-j))) {
                esPalindromo = false;
                break; // Puedes salir del bucle tan pronto como encuentres una discrepancia.
            }
        }

        if (esPalindromo) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        console.close();
    }
}

