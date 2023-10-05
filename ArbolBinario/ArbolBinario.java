package ArbolBinario;

import java.util.Random;

public class ArbolBinario {

    
    public static void main(String[] args) {
        
        Random random = new Random();
        BinarySearchTree<Integer> arbol = new BinarySearchTree<Integer>();
        for(int i=0;i<10;i++){
            int n = random.nextInt(25);
            arbol.insert(n);
        }
        
        
        arbol.printInOrder();
        
        
    }
    
}
