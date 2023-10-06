package ArbolBinario;

import java.util.Random;

public class Exercise1 {

    
    public static void main(String[] args) {
        
        Random random = new Random();
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        for(int i=0;i<10;i++){
            int n = random.nextInt(25);
            tree.insert(n);
        }
        //System.out.println(tree.getRoot()); // Return tree's root
        tree.printInOrder();  // print the numbers in ordered form ( Exercise 2 )
        System.out.println(tree.height()); // Height ( levels )
        System.out.println(tree.size()); // tree's size ( amount of nodes entered )
    }
    // All the modifications of practice five are done.
}
