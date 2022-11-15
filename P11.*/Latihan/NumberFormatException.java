public class NumberFormatException {
    public static void main(String[] args) {
        String text = "Hello";
        int number = Integer.parseInt(text);
    }
}

// Error NumberFormatException terjadi karena kita mencoba untuk mengubah tipe data String ke tipe data numerik, tetapi String tersebut tidak bisa diubah ke tipe data numerik.