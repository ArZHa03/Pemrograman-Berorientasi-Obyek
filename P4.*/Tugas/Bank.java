public class Bank {
    private Nasabah[] nasabah = new Nasabah[4];
    private int jumlahNasabah;

    public Bank() {
        super();
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        this.nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        jumlahNasabah++;
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        return nasabah[indeks];
    }

}
