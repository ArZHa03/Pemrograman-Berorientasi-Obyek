package Tugas;
import java.util.*;

public class Tugas1 {
    public static void main(String[] args) {
        List<String> warna = new ArrayList<String>();
        String[] warnaArray = new String[] {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};

        List<String> warnaDihapus = new ArrayList<String>();
        String[] warnaDihapusArray = new String[] {"RED", "WHITE", "BLUE"};

        warna.addAll(Arrays.asList(warnaArray));
        warnaDihapus.addAll(Arrays.asList(warnaDihapusArray));

        System.out.println("Array awal: ");
        for (String warna1 : warna) {
            System.out.printf("%s ", warna1);
        }

        for (int i = 0; i < warna.size(); i++) {
            for (int j = 0; j < warnaDihapus.size(); j++) {
                if (warna.get(i).equals(warnaDihapus.get(j))) {
                    warna.remove(i);
                }
            }
        }

        System.out.println("\nArray setelah dihapus: ");
        for (String warna1 : warna) {
            System.out.printf("%s ", warna1);
        }
        System.out.println("");
    }
}