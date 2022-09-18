public class Tabungan {
    private int saldo = 0;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void simpanUang(int jumlah) {
        this.saldo += jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if(this.saldo > jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}
