import java.util.*;

public class Latihan3 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();

        listMahasiswa.add(new Mahasiswa("Budi"));
        listMahasiswa.add(new Mahasiswa("Andi"));
        listMahasiswa.add(new Mahasiswa("Caca"));
        listMahasiswa.add(new Mahasiswa("Euis")); 
        listMahasiswa.add(new Mahasiswa("Dedi"));
        
        System.out.println("Sebelum diurutkan:");
        for (Mahasiswa mhs : listMahasiswa) {
            System.out.print(mhs.getNama());
            if(listMahasiswa.indexOf(mhs) != listMahasiswa.size() - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }

        System.out.println("Setelah diurutkan:");
        Collections.sort(listMahasiswa);
        for (Mahasiswa mhs : listMahasiswa) {
            System.out.print(mhs.getNama());
            if(listMahasiswa.indexOf(mhs) != listMahasiswa.size() - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }

        System.out.println("Setelah diacak:");
        Collections.shuffle(listMahasiswa);
        for (Mahasiswa mhs : listMahasiswa) {
            System.out.print(mhs.getNama());
            if(listMahasiswa.indexOf(mhs) != listMahasiswa.size() - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }
}