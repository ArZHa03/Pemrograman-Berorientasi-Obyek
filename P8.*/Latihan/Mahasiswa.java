public class Mahasiswa extends User {
    private Dosen dosenWali;
    private String kelas;

    public Mahasiswa(String username, String password, double phone) {
        super(username, password, phone);
    }

    public Mahasiswa(String username, String password, double phone, Dosen dosenWali, String kelas) {
        super(username, password, phone);
        this.dosenWali = dosenWali;
        this.kelas = kelas;
    }
}
