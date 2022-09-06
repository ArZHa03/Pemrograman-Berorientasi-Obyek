class BilanganGenap {
    private int bilangan;

    public String getResultExcept(int except) {
        this.bilangan += 2;
        if(this.bilangan % except != 0) {
            String s = Integer.toString(this.bilangan);
            return s + "\n";
        } else
            return "";
    }
}
