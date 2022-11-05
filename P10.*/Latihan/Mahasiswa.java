public class Mahasiswa implements Comparable<Mahasiswa> {
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public int compareTo(Mahasiswa mhs) {
        return this.nama.compareTo(mhs.getNama());
    }
}
