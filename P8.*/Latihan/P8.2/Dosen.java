public class Dosen extends Orang {
    private int nip;

    public Dosen(String nama) {
        super(nama);
    }

    public Dosen(String nama, int umur) {
        super(nama, umur);
    }

    public Dosen(String nama, int umur, int nip) {
        super(nama, umur);
        this.nip = nip;
    }

    public void Info() {
        System.out.printf("Nama : %s \nNIP : %s \nUmur : %s \n", this.nama, (umur == 0) ? "-": umur, (nip == 0) ? "-": nip);
    }
}
