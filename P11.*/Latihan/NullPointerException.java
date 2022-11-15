public class NullPointerException {
    public static void main(String[] args) {
        String text = null;
        System.out.println(text.length());
    }
}

// Error NullPointerException terjadi karena kita mencoba untuk mengakses method atau field dari sebuah object yang bernilai null.