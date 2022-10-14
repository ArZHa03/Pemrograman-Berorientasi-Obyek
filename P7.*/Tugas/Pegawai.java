public class Pegawai {
    protected String nama;
    protected int gaji;

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String infoNama(){ return this.nama; }
    public int infoGaji() { return this.gaji; }
}
