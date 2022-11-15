public class StringIndexOutOfBoundsException {
    public static void main(String[] args) {
        String text = "Hello";
        System.out.println(text.charAt(5));
    }
}

// Error StringIndexOutOfBoundsException terjadi karena kita mencoba untuk mengakses index yang tidak ada di String.