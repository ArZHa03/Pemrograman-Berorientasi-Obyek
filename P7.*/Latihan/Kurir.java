public class Kurir extends Pegawai {
    private int bonus;

    public Kurir(String name, int gaji, int bonus) {
        super(name, gaji);
        this.bonus = bonus;
    }

    public String infoNama() { return this.nama; }
    public int infoGaji() { return this.gaji; }
    public int infoBonus() { return this.bonus; }
}
