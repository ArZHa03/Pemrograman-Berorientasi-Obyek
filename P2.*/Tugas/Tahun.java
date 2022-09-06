class Tahun {
    private int tahun;

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getResultKabisat() {
        if(this.tahun <= 1899) {
            return "Maaf, tahun inputan dibawah 1900";
        }
        else if(this.tahun  >= 2006) {
            return "Maaf, tahun input diatas 2005";
        }
        else {
            if(this.tahun % 400 == 0 || this.tahun % 100 != 0 && this.tahun % 4 == 0) {
                return this.tahun + " adalah tahun kabisat";
            }
            return this.tahun + " bukan tahun kabisat";
        }
    }
}
