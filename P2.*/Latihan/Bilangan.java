class Bilangan {
    private int bilangan;
    private int result = 1;

    public void setBilangan(int bilangan) {
        this.bilangan = bilangan;
    }

    public int getBilangan() {
        return this.bilangan;
    }

    public int getFaktorial(int i) {
        result = result * i;

        return result;
    }
}
