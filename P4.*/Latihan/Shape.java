class Shape {
    public double length;
    public double width;
    public double height;
    public double volume;

    public Shape (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        calculateVolume();
    }

    public double compareTo(Shape shape) {
        if(shape.volume >= this.volume)
            return shape.volume - this.volume;
        else
            return this.volume - shape.volume;
    }

    private void calculateVolume() {
        this.volume = this.length * this.width * this.height;
    }

    public void cetak() {
        System.out.println("Panjangxlebarxtinggi = " + this.length + "x" + this.width + "x" + this.height);
        System.out.println("Volume = " + this.volume);
    }
}
