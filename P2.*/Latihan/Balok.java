class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public void setBalok(int sisi) {
        this.panjang = this.lebar = this.tinggi = sisi;
    }

    public int getResult() {
        return this.panjang * this.lebar * this.tinggi;
    }
}
