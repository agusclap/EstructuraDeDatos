package ArbolBinario;

import java.util.Random;

public class ArbolBinario {

    
    public static void main(String[] args) {
        BinarySearchTree<Integer> arbol = new BinarySearchTree<Integer>();
        Random random = new Random();
        for(int i=0;i<10;i++)
            arbol.insert(random.nextInt(25));

            
    }
    
}
