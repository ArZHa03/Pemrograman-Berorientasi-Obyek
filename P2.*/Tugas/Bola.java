class Bola {
    private int radius;

    public void setBola (int radius){
        this.radius = radius;
    }

    public double getResultVolume() {
        return (4 * 3.14 * Math.pow(radius, 3)) / 3;
    }
}
