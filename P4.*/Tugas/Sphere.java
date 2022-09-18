class Sphere extends Circle {

    Sphere(double radius) {
        super(radius);
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2) * 4;
    }

    double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4/3;
    }
}
