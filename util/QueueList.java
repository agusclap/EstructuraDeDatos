

public class QueueList<AnyType> {

    private Nodo<AnyType> front;
    private Nodo<AnyType> back;

    public QueueList() {
        front = back = null;
    }

    public void enqueue(AnyType x) {
        if (isEmpty())
            back = front = new Nodo<AnyType>(x);
        else
            back = back.next = new Nodo<AnyType>(x);
    }

    public AnyType dequeue() {
        if (isEmpty()) {
            //throw new UnderflowException("QueueList dequeue");
            System.out.println("Cola vacia");
        }
        AnyType returnValue = front.data;
        front = front.next;
        return returnValue;

    }

    public AnyType getFront() {
        if (isEmpty())
            System.out.println("ERROR");
            //throw new UnderflowException("QueueList getFront");
        return front.data;
    }

    public void makeEmpty() {
        front = null;
        back = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() { // No me lo cuenta  idk
        int count = 0;
        Nodo<AnyType> actual = this.front;
        while (actual != null) {
          count++;
          actual = actual.next;
        }
        return count;
      }

}

