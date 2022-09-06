public class Number {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public String getResult() {
        if(this.number % 2 == 0)
            return "Genap";
        else
            return "Ganjil";
    }
}
