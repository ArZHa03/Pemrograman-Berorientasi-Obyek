class Number {    private int number = 99999999;    public void setNumberLowest(int number) {        this.number = number < this.number ? number : this.number;    }    public int getNumberLowest() {        return this.number;    }}