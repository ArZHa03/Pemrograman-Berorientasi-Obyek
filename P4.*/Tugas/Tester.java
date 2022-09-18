class Tester {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(7, 6);
        Sphere sphere = new Sphere(6);

        System.out.println("the raidus of this Cylinder is  " + cylinder.getRadius());
        System.out.println("the height of this Cylinder  is " + cylinder.getHeight());
        System.out.println("the diamter of this Cylinder  is " + cylinder.getDiameter());
        System.out.println("the Area of this Cylinder  is " + cylinder.getArea());
        System.out.println("the volume of this Cylinder  is " + cylinder.getVolume());

        System.out.println("the raidus of this Sphere is  " + sphere.getRadius());
        System.out.println("the volume of this Sphere  is " + sphere.getVolume());
        System.out.println("the diamter of this Sphere  is " + sphere.getDiameter());
        System.out.println("the Area of this Sphere  is " + sphere.getArea());
    }
}
