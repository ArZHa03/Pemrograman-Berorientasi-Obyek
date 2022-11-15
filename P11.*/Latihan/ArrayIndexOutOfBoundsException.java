public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[5]);
    }
}

// Error ArrayIndexOutOfBoundsException terjadi karena kita mencoba untuk mengakses index yang tidak ada di array.