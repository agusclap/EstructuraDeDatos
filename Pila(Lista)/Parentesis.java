

import java.util.Scanner;

public class Parentesis {

    public static void main(String[] args) {
        StackList<String> stack = new StackList<String>();
        String expresion = " ";
        char exp = ' ';
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Ingrese una expresion matematica");
            expresion = console.next();
        }
        for (int i = 0; i < expresion.length(); i++) {
            exp = expresion.charAt(i);
            stack.push(String.valueOf(exp));
        }
        String help;
        int cont = 0;
        while (stack.isEmpty()) {
            help = stack.pop();
            if (help == ")" || help == "(") {
                cont++;
            }

        }
        if (cont % 2 == 0) {
            System.out.println("Parentesis balanceado");
        } else {
            System.out.println("Parentesis Desbalanceados");
        }
    }
}
