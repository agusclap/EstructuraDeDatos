/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinario1;

/**
 *
 * @author alumno
 */
public class BinaryNode<AnyType> {
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
        if(left != null )
            left.printPreOrder();  // left
        if( right != null )
            right.printPreOrder();  // Right
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
        if( left != null) // left
            left.printInOrder();
        System.out.println(element); // Node
        if( right != null)
            right.printInOrder(); // Right
    }
}