public class ArithmeticException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println(c);
    }
}

/* 
// Error tersebut terjadi karena kita mencoba untuk membagi sebuah bilangan dengan 0 (nol).Jika kita ingin mengatasi error tersebut, kita bisa menggunakan try-catch block. Contohnya seperti ini:

// Path: Latihan/ArithmeticException.java

public class ArithmeticException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

// Output di atas adalah output yang akan kita dapatkan jika kita menjalankan program tersebut. Kita bisa melihat bahwa program tersebut berhasil dijalankan dan tidak terjadi error. Jika kita ingin menampilkan pesan error yang lebih detail, kita bisa menggunakan method getMessage() dari class Exception. Contohnya seperti ini:

// Path: Latihan/ArithmeticException.java

public class ArithmeticException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
*/