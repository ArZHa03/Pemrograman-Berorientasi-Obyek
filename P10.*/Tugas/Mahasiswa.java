package Tugas;

public class Mahasiswa implements Comparable<Mahasiswa> {
    private String Nrp;
    private String Nama;
    private Float Nilai;

    public Mahasiswa(String nrp, String nama, Float nilai) {
        Nrp = nrp; Nama = nama; Nilai = nilai; }

    public String getNrp() { return Nrp; }

    public String getNama() { return Nama; }

    public Float getNilai() { return Nilai; }

    @Override
    public int compareTo(Mahasiswa o) {
        return this.Nilai.compareTo(o.Nilai);
    }
}