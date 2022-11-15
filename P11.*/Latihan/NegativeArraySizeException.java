public class NegativeArraySizeException {
    public static void main(String[] args) {
        int[] numbers = new int[-1];
    }
}

// Error NegativeArraySizeException terjadi karena kita mencoba untuk membuat array dengan ukuran negatif. 