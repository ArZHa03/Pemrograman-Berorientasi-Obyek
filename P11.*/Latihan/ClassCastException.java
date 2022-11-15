public class ClassCastException {
    public static void main(String[] args) {
        Object object = new String("Hello");
        Integer integer = (Integer) object;
    }
}

// Error ClassCastException terjadi karena kita mencoba untuk mengubah tipe data dari String ke Integer.