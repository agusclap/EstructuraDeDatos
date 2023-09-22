

import java.util.Scanner;


public class palabra {
    public static void main(String[] args) {
        StackList<String> pilaString = new StackList<String>();
        Scanner console = new Scanner(System.in);
        String word = " ";
        char seguir = ' ';
        do{
            System.out.println("Ingrese una palabra");
            word = console.next();
            pilaString.push(word);
            System.out.println("Quiere continuar con el programa ? y/n");
            seguir = console.next().charAt(0);
        }while(seguir == 'y' || seguir == 'Y');
        System.out.println("Imprimiendo...");
        while(pilaString.isEmpty() == false){
            System.out.println(pilaString.pop());
        }
        
    }
}
