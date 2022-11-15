public class ArrayStoreException {
    public static void main(String[] args) {
        Object[] objects = new String[10];
        objects[0] = 1;
    }
}

// Error di atas terjadi karena kita mencoba untuk mengisi array dengan tipe data yang berbeda. Jika kita ingin mengatasi error tersebut.