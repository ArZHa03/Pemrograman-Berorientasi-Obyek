class Fibonacci {
    private int fibo;
    private int a = 1, b = 1, c;

    public void setFibo(int fibo) {
        this.fibo = fibo;
    }

    public int getFibo() {
        return this.fibo;
    }

    public String getResultFibo() {
        this.c = this.a + this.b;
        this.a = this.b;
        this.b = this.c;
        if(this.c > 2) {
            return this.c + " ";
        } else if(this.c == 2) {
            return "1 1 2 ";
        } else {
            return " ";
        }
    }
}
