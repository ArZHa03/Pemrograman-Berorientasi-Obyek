class Truk {
    private double muatan, muatanmaks;

    public Truk (double beratmaks) {
        this.muatanmaks = kiloToNewts(beratmaks);
    }

    public double getMuatan() {
        return newtsToKilo(this.muatan);
    }

    public double getMuatanMaks() {
        return newtsToKilo(this.muatanmaks);
    }

    public boolean tambahMuatan(double berat) {
        double temp newtsToKilo(this.muatan) + berat;

        if(temp <= newtsToKilo(muatanmaks)) {
            this.muatan += kiloToNewts(berat);
            return true;
        }
        else
            return false;
    }

    public double newtsToKilo(double berat) {
        return berat / 9.8;
    }

    public double kiloToNewts(double berat) {
        return berat * 9.8;
    }
}
