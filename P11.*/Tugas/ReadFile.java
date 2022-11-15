/*
public class ReadFile {
    public static void main(String args[]){
        File file = new File("Data.txt");
        BufferedReader fileReader ;
        fileReader = new BufferedReader(new FileReader(file));
        while(true){
            String line = fileReader.readLine();
            if (line == null)
                break;
            System.out.println(line);
        }
    }
}

// Error FileNotFoundException terjadi karena kita mencoba untuk membaca file yang tidak ada. Cara mengatasinya adalah dengan menambahkan try-catch block. Kita juga bisa menambahkan throws FileNotFoundException pada method main untuk mengatasi error tersebut. Contoh programnnya seperti berikut ini:

// Path: Latihan/ReadFile.java

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        File file = new File("Data.txt");
        BufferedReader fileReader ;
        fileReader = new BufferedReader(new FileReader(file));
        while(true){
            String line = fileReader.readLine();
            if (line == null)
                break;
            System.out.println(line);
        }
    }
}

// Output di atas adalah output yang akan kita dapatkan jika kita menjalankan program tersebut. Kita bisa melihat bahwa program tersebut berhasil dijalankan dan tidak terjadi error. Jika kita ingin menampilkan pesan error yang lebih detail, kita bisa menggunakan method getMessage() dari class Exception. Contohnya seperti ini:

// Path: Latihan/ReadFile.java

*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        File file = new File("Data.txt");
        BufferedReader fileReader ;
        try {
            fileReader = new BufferedReader(new FileReader(file));
            while(true){
                String line = fileReader.readLine();
                if (line == null)
                    break;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Program di atas termasuk checkced exception karena kita harus menambahkan throws FileNotFoundException dan IOException pada method main untuk mengatasi error tersebut serta menggunakan try-catch block untuk menangani error tersebut.