import java.util.Scanner;


public class Palindromo {
    public static void main(String[] args) {
        Stack<String> cadena = new Stack<String>(1);
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String a = console.next();
        console.close();
        System.out.println(a.toLowerCase());
        int p = a.length();
        for (int i = 0; i < p; i++) {
            String k = a.valueOf(i);
            cadena.push(k);
        }
        int x = 0;
        try {
            for (int k = 0; k < p; k++) {

                if (cadena.pop() == a.valueOf(p + 1))
                    ;
                x++;
                System.out.println("Son iguales");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Son iguales");
    }

}
