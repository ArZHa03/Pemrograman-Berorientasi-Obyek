class OperasiTerhadapString {
    public static void main (String args[]) {
        String sentence = "Selamat Datang di PENS";
        String find = "PENS";
        int indexOfStart = sentence.indexOf(find);
        int indexOfEnd = indexOfStart + find.length();

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.length());
        System.out.println(sentence.substring(indexOfStart, indexOfEnd) + " Berada di index " + indexOfStart + " - " + indexOfEnd);
    }
}
