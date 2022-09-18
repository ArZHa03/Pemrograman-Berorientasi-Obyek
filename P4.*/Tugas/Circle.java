class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double getDiameter() {
        return this.radius * 2;
    }

    double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
