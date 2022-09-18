class MencariNilaiRataRata {
    public static void main (String[] args) {
        double nilai[][] = { {1, 81, 90, 62}, {2, 50, 83, 87}, {3, 89, 55, 65}, {4, 77, 70, 92}};

        System.out.println(nilai[0][0] + "\t" + ((nilai[0][1]+nilai[0][2]+nilai[0][3]) / 3) );
        System.out.println(nilai[1][0] + "\t" + ((nilai[1][1]+nilai[1][2]+nilai[1][3]) / 3) );
        System.out.println(nilai[2][0] + "\t" + ((nilai[2][1]+nilai[2][2]+nilai[2][3]) / 3) );
        System.out.println(nilai[3][0] + "\t" + ((nilai[3][1]+nilai[3][2]+nilai[3][3]) / 3) );
    }
}
