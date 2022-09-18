class MenampilkanIndexPadaKalimat {
    public static void main(String[] args) {
        String kalimat = "Politeknik Elektronika Negeri Surabaya";
        String karakter = "o";

        System.out.print("Karakter '" + karakter + "' terdapat pada index ");
        for(int i = 0; i < kalimat.length();) {
            i = kalimat.indexOf(karakter, i);
            if(i == -1)
                break;
            System.out.print(i + ", ");
            i++;
        }
    }
}
