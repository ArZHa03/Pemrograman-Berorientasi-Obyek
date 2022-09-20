class MultiTabungan {
    private int saldo;
    private boolean status;

    public MultiTabungan(int initsaldo) {
        this.saldo = initsaldo;
        getSaldo();
    }

    public MultiTabungan(String tipe, int initsaldo) {
        if(tipe.equalsIgnoreCase("USD"))
            this.saldo = initsaldo * 9000;
        else if(tipe.equalsIgnoreCase("AUD"))
            this.saldo = initsaldo * 10000;
        else
            this.saldo = initsaldo;
        getSaldo();
    }

    private void getSaldo() {
        System.out.println("Saldo Anda Saat ini: ");
        System.out.println("Saldo (IDR): " + this.saldo);
        System.out.println("Saldo (USD): " + this.saldo / 9000);
        System.out.println("Saldo (AUD): " + this.saldo / 10000);
    }

    public void simpanUang(String tipe, int jumlah) {
        System.out.println(jumlah + " " + tipe + " Berhasil disimpan");
        if(tipe.equalsIgnoreCase("USD"))
            this.saldo += jumlah * 9000;
        else if(tipe.equalsIgnoreCase("AUD"))
            this.saldo += jumlah * 10000;
        else
            this.saldo += jumlah;
        getSaldo();
    }

    public void ambilUang(String tipe, int jumlah) {
        if(tipe.equalsIgnoreCase("USD") && jumlah * 9000 <= this.saldo) {
            this.saldo -= jumlah * 9000;
            status = true;
        } else if(tipe.equalsIgnoreCase("AUD") && jumlah * 10000 <= this.saldo) {
            this.saldo -= jumlah * 10000;
            status = true;
        } else if(jumlah <= this.saldo) {
            saldo -= jumlah;
            status = true;
        } else
            status = false;

        if(status)
            System.out.println("Berhasil mengambil uang sebesar " + jumlah + " (" + tipe + ")");
        else
            System.out.println("Saldo anda kurang");

        getSaldo();
    }

    public void ambilUang(int jumlah) {
        if(jumlah <= this.saldo) {
            saldo -= jumlah;
            status = true;
        } else
            status = false;

        if(status)
            System.out.println("Berhasil mengambil uang sebesar " + jumlah + " (IDR)");
        else
            System.out.println("Saldo anda kurang");

        getSaldo();
    }
}
