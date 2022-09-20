class TesMultiTabungan {
    public static void main(String[] args) {
        MultiTabungan tabungan = new MultiTabungan("USD", 300);

        tabungan.simpanUang("AUD", 27);

        tabungan.ambilUang(700000);
    }
}
