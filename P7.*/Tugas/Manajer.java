public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan){
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public String infoNama() { return this.nama; }
    public int infoGaji() { return this.gaji; }
    public int infoTunjangan() { return this.tunjangan; }
}
