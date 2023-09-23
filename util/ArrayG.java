public class ArrayG<T> {
    private Integer index;
    private Integer size;
    private T array[];

    public ArrayG(Integer size) {
        this.size = size;
        this.index = 0;
        this.array = (T[]) new Object[size]; // advertencia debido al casteo de un array generico, no asegura que todos los objetos sean del mismo tipo a la hora de la compilacion
    }

    public void agregarElemento(T item) {
        this.array[index] = item;
        this.index++;
    }

    public T quitarElemento()  {
        if (isEmpty()) {
            try {
                throw new Exception("arreglo vacio");
            } catch (Exception e) {
                e.printStackTrace();
            }
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
