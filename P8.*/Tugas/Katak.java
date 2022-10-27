public class Katak {
    protected int umur;
    protected String nama;

    public Katak(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    public String caraBergerak() {
        if(umur > 4)
            return "melompat";
        else
            return "berenang";
    }
}
