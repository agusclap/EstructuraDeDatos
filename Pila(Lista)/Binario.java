

import java.util.Scanner;


public class Binario {

    public static void decBin(int n, StackList<Integer> list) {
        int valor;
        if (n < 2) {
            list.push(n);
            System.out.print(n);
        } else {
            decBin(n / 2, list);
            valor = n % 2;
            list.push(valor);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        StackList<Integer> l = new StackList<Integer>();
        Scanner console = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese el numero para pasar a binario");
        numero = console.nextInt();
        console.close();
        
        if(numero==0){
            System.out.println("0");
        }
        while (numero>0) {
            
            int remainder = numero % 2;
             l.push(remainder);
            //System.out.print(numero);
            numero = numero/2;
            
        }
        System.out.println("El numero ingresado en binario es: ");
        for(int i=0;i<4;i++)
            System.out.print(l.pop());
    }
}
