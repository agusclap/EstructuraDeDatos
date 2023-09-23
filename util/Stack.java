

public class Stack<T> {
    private Integer index;
    private Integer size;
    private T array[];

    public Stack(Integer size) {
        this.size = size;
        this.index = 0;
        this.array = (T[]) new Object[size]; // advertencia debido al casteo de un array generico, no asegura que todos los objetos sean del mismo tipo a la hora de la compilacion
    }

    public void push(T item) {
        this.array[index] = item;
        this.index++;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("pila vacia");
        }
        T value = this.array[this.index - 1];
        this.index--;
        return value;
    }

    public Boolean isEmpty() {
        return this.index == 0;
    }

    public T top() {
        return this.array[this.index - 1];
    }

    public void makeEmpty() {
        this.index = 0;
    }

    public Boolean isFull() {
        return this.index == this.size;
    }

};
