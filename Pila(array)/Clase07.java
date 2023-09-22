



public class Clase07 {

   
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(4);
        try{
            stack.push(9*3+5-6);
            stack.push(7);
            stack.push(6);
            stack.push(10);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        Stack<String> StackString = new Stack<String>(5);
        try{
            StackString.push("Hola");
            StackString.push("Mundo");
            StackString.push("Que");
            StackString.push("Tal");
            StackString.push("Estan");
            if(StackString.isFull())
                System.out.println("Pila Llena");
            
            System.out.println(StackString.pop());
            System.out.println(StackString.pop());
            System.out.println(StackString.pop());
            System.out.println(StackString.pop());
            System.out.println(StackString.pop());
            if(StackString.isEmpty())
                System.out.println("Pila vacia");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
