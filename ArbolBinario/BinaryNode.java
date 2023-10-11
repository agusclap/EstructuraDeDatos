
package ArbolBinario;


public class BinaryNode<AnyType> {
    int bal; // para almacenar el valor del equilibro del nodo
    AnyType element;
    BinaryNode<AnyType> left;
    BinaryNode<AnyType> right;
    
    
    public BinaryNode (AnyType element){
        this.element = element;
        left = right = null;
    }

    public BinaryNode(AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt){
       element = theElement;
       left = lt;
       right = rt;
        
    }
    
    public AnyType getElement(){
        return element;
    }
    
    public BinaryNode<AnyType> getLeft(){
        return left;
    }
    
    public BinaryNode<AnyType> getRight(){
        return right;
    }
    public void setElement(AnyType x){
        element = x;
    }
    public void setLeft(BinaryNode<AnyType> t){
        left = t;
    }
    public void setRight(BinaryNode<AnyType> r){
        right = r;
    }
    public static <AnyType> int size(BinaryNode<AnyType> t){
        if( t==null )
            return 0;
        else
            return 1 + size(t.left) + size(t.right);
    }
    public static <AnyType> int height (BinaryNode<AnyType> t){
        if( t == null)
            return -1;
        else
            return 1 + Math.max(height(t.left),height(t.right));
    }
    public BinaryNode<AnyType> duplicate(){
        BinaryNode<AnyType> root = new BinaryNode<AnyType> ( element, null, null);
        
        if(left != null) // If there's a left subtree
            root.left = left.duplicate(); // Duplicate, attach
        if(right != null) // If there's a right subtree
            root.right = right.duplicate(); // Duplicate; aatach
        return root; // Return resulting tree
    }
    public void printPreOrder(){
        System.out.println(element); // Node
        if(left != null ){
            left.printPreOrder();  // left
        }
        if( right != null ){
            right.printPreOrder();  // Right
       }
    }

    

    public void printPreOrder(int depth) {
        // print spaces for the depth
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    
        // print the node's value
        System.out.print("|");
        System.out.println("-"+element);
    
        // Recursivity for the others childs
        if (left != null) {
            left.printPreOrder(depth + 1);
        }
        if (right != null) {
            right.printPreOrder(depth + 1);
        }
    }
    
    
    //Print tree rooted at current node using postorder traversal
    public void printPostOrder(){
        if(left != null) // left
            left.printPostOrder();
        if( right != null) // Right
            right.printPostOrder();
        System.out.println(element); // Node
    }
    
    public void printInOrder(){
        if( left != null){ // left
            left.printInOrder();
            System.out.print("_");
            
        }
        System.out.println(element); // Node
        System.out.print("|");
        //System.out.print("_");
        if( right != null){
            right.printInOrder(); // Right
            System.out.print("_");
        } 
    }

    /*
     * Rotate binary tree node with left child
     * For AVL trees, this is a single rotation for case 1.
     */
    public BinaryNode<AnyType> rotateLeftChild ( BinaryNode<AnyType> k2 ){
        BinaryNode<AnyType> k1 = k2.left;
        k2.left = k1.right;
        k1.right  = k2;
        return k1;
    }
    /*
     * Rotate binary tree node with right child
     * For AVL trees, this is a single rotation for case 1.
     */
    public BinaryNode<AnyType> rotateRightChild( BinaryNode<AnyType> k2){
        BinaryNode<AnyType> k1 = k2.right;
        k2.right = k1.left;
        k1.left = k2;
        return k1;
    }
}
