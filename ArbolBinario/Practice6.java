package ArbolBinario;

import java.util.Random;

public class Practice6 {
    public static void main(String[] args) {
        Random random = new Random();
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        for(int i=0;i<10;i++){
            tree.insert(random.nextInt(100));
        }
        tree.printPreOrder(tree.height());
    }
}
