public class TestPegawai {

    private static void getAllInfoPegawai(Pegawai pegawai) {
        if(pegawai instanceof Manager) {
            Manager manager = (Manager) pegawai;
            System.out.println("Seorang manager bernama " + manager.infoNama() + " dengan gaji " + manager.infoGaji() + " dan tunjangan sebesar " + manager.infoTunjangan() + ".");
        } else if(pegawai instanceof Kurir) {
            Kurir kurir = (Kurir) pegawai;
            System.out.println("Seorang kurir bernama " + kurir.infoNama() + " dengan gaji " + kurir.infoGaji() + " dan bonus sebesar " + kurir.infoBonus() + ".");
        } else {
            System.out.println("Seorang pegawai bernama " + pegawai.infoNama() + " dengan gaji " + pegawai.infoGaji() + ".");
        }
    }

    public static void main(String args[]) {
        Pegawai zaki = new Manager("Zaki", 7999000, 1350000);
        Pegawai irawan = new Kurir("Irawan", 1999000, 399000);

        getAllInfoPegawai(zaki);
        getAllInfoPegawai(irawan);
    }
}
