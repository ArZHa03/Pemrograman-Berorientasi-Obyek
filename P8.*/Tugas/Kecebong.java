public class Kecebong extends Katak {
    private double panjangEkor;

    public Kecebong(int umur, String nama, double panjangEkor) {
        super(umur, nama);
        this.panjangEkor = panjangEkor;
    }

    public double getPanjangEkor() {
        return panjangEkor;
    }
}
