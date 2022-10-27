public class TesTugas2{

    private static void getInfo(Kecebong cebong) {
        if(cebong.umur > 4)
            System.out.printf("Seekor katak berumur %s minggu bernama %s tidak memiliki ekor yang bergerak dengan cara %s.\n", cebong.umur, cebong.nama, cebong.caraBergerak());
        else
            System.out.printf("Seekor kecebong berumur %s minggu bernama %s memiliki ekor sepanjang %s cm yang bergerak dengan cara %s.\n", cebong.umur, cebong.nama, cebong.getPanjangEkor(), cebong.caraBergerak());
    }

    public static void main(String args[]){
        Kecebong O1 = new Kecebong(5, "Froggy", 0);
        Kecebong O2 = new Kecebong(2, "Junior Froggy", 10);

        getInfo(O1);
        getInfo(O2);
    }
}
