import java.util.Scanner;

public class Palindromo {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String a = console.next();
        Stack<Character> pila = new Stack<Character>(a.length());
        console.close();
        int p = a.length();
        boolean y = false;
        for(int x=0;x<p;x++)
            pila.push(a.charAt(x));
        for(int i=0;i<p;){
            if(!pila.pop().equals(a.charAt(i)))
                y = true;
                break;
            }
        if(y)
            System.out.println("No es palindromo");
        else
            System.out.println("Si es palindromo");
    }
}



