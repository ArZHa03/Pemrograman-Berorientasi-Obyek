public class NoSuchElementException {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(iterator.next());
    }
}

// Error NoSuchElementException terjadi karena kita mencoba untuk mengakses elemen berikutnya dari iterator yang sudah tidak ada.