import java.util.Scanner;

public class MetodosOrdenamiento {
    public static void main(String[] args) {
        char seguir = ' ';
        char opcion = ' ';
        int tipo = 0;
        int size = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el tipo de dato:");
        System.out.println("1) Integer");
        System.out.println("2) Double");
        System.out.println("3) Character");
        tipo = console.nextInt();
        System.out.println("Ingrese el tamaño del arreglo");
        size = console.nextInt();
        
        do{

            System.out.println("MENU DE OPCIONES: ");
            System.out.println("a) Ordenamiento por insercion");
            System.out.println("b) Ordenamiento Shell");
            System.out.println("c) Ordenamiento Quick Sort");
            opcion = console.next().charAt(0);
            switch(opcion){
                case 'a':
                {
                    switch(tipo){
                        case 1 :
                        {
                            int [] array = new int[size];
                            insertionSort(array);
                            break;
                        }
                        case 2:
                        {
                            ArrayG<Double> array = new ArrayG<Double>(size);
                            break;
                        }
                        case 3:
                        {
                            //=???
                            break;
                        }
                    }

                    break;
                }
                case 'b':
                {

                    break;
                }
                case 'c':
                {

                    break;
                }
            }
            System.out.println("Quiere seguir con el programa ? y/n");
            seguir = console.next().charAt(0);
        }while(seguir == 'y' || seguir == 'Y');
        console.close();
    }

    public static <T extends Comparable<? super T>>
    void insertionSort(T [] a){
    
        for(int p = 1; p < a.length; p++){
            T tmp = a[p];
            int j = p;

            for( ; j>0 && tmp.compareTo(a[j - 1]) < 0;j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }




}
