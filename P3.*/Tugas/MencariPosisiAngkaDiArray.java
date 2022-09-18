class MencariPosisiAngkaDiArray {
    public static void main(String args[]) {
        int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 },{ 622, 127, 77, 955 }};

        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= 3; j++) {
                if(arrayOfInts[i][j] == 12)
                    System.out.println("Found 12 at " + i + ", " + j);
            }
        }
    }
}
