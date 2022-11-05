import java.util.*;

public class Latihan2_1 {
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
        }
    }
}