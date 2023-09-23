import java.util.Scanner;

public class Palindromo {

    public static boolean EsPalindromo(String palabra, int longitud) {
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false; // No es un palíndromo
            }
        }
        return true; // Es un palíndromo
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String a = console.next();
        console.close();
        int p = a.length();
        if (EsPalindromo(a, p))
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");
    }
}



