class Cylinder extends Circle {
    private double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    void setHeight() {
        this.height = height;
    }

    double getHeight() {
        return this.height;
    }

    double getVolume() {
        return Math.PI * Math.pow(radius, 2) * this.height;
    }
}
