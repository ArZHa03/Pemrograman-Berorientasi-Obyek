import java.util.*;

class MenentukanTahunKabisat {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Tahun tahun = new Tahun();

        tahun.setTahun(input.nextInt());

        System.out.println(tahun.getResultKabisat());
    }
}
