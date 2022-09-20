class Kalender {
    private int tanggal, bulan, tahun;

    public Kalender(int tanggal) {
        this.tanggal = tanggal;
        this.bulan = 1;
        this.tahun = 2000;
    }

    public Kalender(int bulan, int tahun) {
        this.tanggal = 1;
        this.bulan = bulan;
        this.tahun= tahun;
    }

    public Kalender(int tanggal, int bulan, int tahun) {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    void setBulan(int bulan) {
        this.bulan = bulan;
    }

    void setTahun(int tahun) {
        this.tahun = tahun;
    }

    int getTanggal() {
        return this.tanggal;
    }

    int getBulan() {
        return this.bulan;
    }

    int getTahun() {
        return this.tahun;
    }
}
