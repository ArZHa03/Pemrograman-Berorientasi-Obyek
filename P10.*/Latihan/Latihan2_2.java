import java.util.*;

public class Latihan2_2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kalimat : ");
            String kalimat = input.nextLine();
            String[] kata = kalimat.split(" ");
            TreeMap <String, Integer> data = new TreeMap <String, Integer>();
            for (int i = 0; i < kata.length; i++) {
                if (data.containsKey(kata[i])) {
                    data.put(kata[i], data.get(kata[i]) + 1);
                } else {
                    data.put(kata[i], 1);
                }
            }
            System.out.println(data);

            // Nilai terendah
            int min = Collections.min(data.values());
            System.out.println("Nilai terendah : " + min);

            // Nilai tertinggi
            int max = Collections.max(data.values());
            System.out.println("Nilai tertinggi : " + max);
            System.out.println("Kata dengan awalan m : ");
            for (String key : data.keySet()) {
                if (key.startsWith("m")) {
                    System.out.println(key + " = " + data.get(key));
                }
            }
        }
    }
}

// Cara kerja mengambil nilai terendah dan tertinggi dan kata dengan awalan m :
// 1. Menggunakan fungsi min dan max dari class Collections untuk mengambil nilai terendah dan tertinggi dari data.values() yang merupakan nilai dari data.
// 2. Menggunakan fungsi containsKey untuk mengecek apakah kata sudah ada di dalam map atau belum dan jika sudah ada maka nilai dari kata tersebut ditambah 1. Jika belum ada maka kata tersebut dimasukkan ke dalam map dengan nilai 1.
// 3. Menggunakan fungsi startsWith untuk mengecek apakah kata dimulai dengan huruf m atau tidak dan jika iya maka kata tersebut dicetak. Jika tidak maka kata tersebut dilewatkan.