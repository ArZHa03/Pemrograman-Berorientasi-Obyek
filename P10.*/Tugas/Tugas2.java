package Tugas;
import java.util.*;

public class Tugas2 {
    public static float randomFloat(float min, float max) {
        return (float) (Math.random() * (max - min) + min);
    }
    public static void main(String[] args) {
        List<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
        String[] namaArray = new String[] {"Ananda", "Balion", "Caca", "Dewi", "Eko", "Fikri", "Gota", "Hari", "Igun", "Jabar"};
        for (int i = 0; i < 10; i++) {
            mahasiswa.add(new Mahasiswa(Integer.toString(i+1), namaArray[i], randomFloat(60, 100)));
        }
        System.out.println("Sebelum diurutkan: ");
        for (Mahasiswa mhs : mahasiswa) {
            System.out.println(mhs.getNrp() + " " + mhs.getNama() + " " + mhs.getNilai());
        }
        System.out.println("Setelah diurutkan: ");
        Collections.sort(mahasiswa);
        for (Mahasiswa mahasiswa1 : mahasiswa) {
            System.out.println(mahasiswa1.getNrp() + " " + mahasiswa1.getNama() + " " + mahasiswa1.getNilai());
        }
    }
}