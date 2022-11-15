import java.lang.RuntimeException;
import java.util.EmptyStackException;

public class Stack {
    public int size;
    public int top;
    public Object elements[];

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.elements = new Object[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Object element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        elements[++top] = element;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top--];
    }
}

/* 
    * Stack di atas menggunakan array untuk menyimpan elemen. 
    * Implementasi stack ini tidak efisien karena array tidak 
    * akan berkurang jika elemen dihapus. 

    * Implementasi stack yang lebih efisien adalah dengan 
    * menggunakan linked list. Karena linked list memiliki
    * pointer yang menunjuk ke elemen selanjutnya, maka
    * elemen yang dihapus tidak perlu dihapus dari memory.

    * Dengan menggunakan RuntimeException, maka kita tidak
    * perlu menambahkan throws Exception pada method pop()
    * dan push(). Karena RuntimeException merupakan 
    * subclass dari Exception, maka kita tidak perlu
    * menambahkan throws Exception pada method main().

    * Dengan menggunakan EmptyStackException, maka kita
    * tidak perlu menambahkan throws Exception pada method
    * pop(). Krn jika stack kosong, maka method pop() akan
    * mengembalikan nilai null.
*/ 