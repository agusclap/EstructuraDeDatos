import java.util.Scanner;

public class ParentesisCheck {
    public static void main(String[] args) {
        String expresion = "";
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese una expresion matematica");
        expresion = console.next();
        int contador = 0;
        console.close();
        Stack<Character> pila = new Stack<Character>(expresion.length());
        for(int i=0;i<expresion.length();i++)
            pila.push(expresion.charAt(i));
        char help = ' ';
        for(int x=0;x<expresion.length();x++){
            help = pila.pop();
            if(help == '(' || help == ')')
                contador++;
        }
        if(contador%2==0)
            System.out.println("Expresion matematica correcta");
        else
            System.out.println("Expresion matematica incorrecta");
    }
}
