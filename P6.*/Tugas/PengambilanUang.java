public class PengambilanUang extends Tabungan {
    private int proteksi;

    public PengambilanUang(int saldo) {
        this.saldo = saldo;
    }

    public PengambilanUang(int saldo, int tingkatBunga) {
        this.saldo = saldo;
        this.proteksi = tingkatBunga;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public boolean ambilUang(int jumlah) {
        if(this.saldo - this.proteksi >= jumlah) {
            this.saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}
