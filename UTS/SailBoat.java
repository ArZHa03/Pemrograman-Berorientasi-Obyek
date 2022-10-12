public class SailBoat extends Boat {
    private double mastHeight, sailArea, tax = 0.1;

    SailBoat(String name, double height, double length, double width, double mastHeight, double sailArea){
        super(name, height, length, width);
        this.mastHeight = mastHeight;
        this.sailArea = sailArea;
        BoatStorage.countSailBoat++;
    }

    public double totalMonthlyCharge(){
        setSailBoat(this);
        return (mastHeight * sailArea) * tax;
    }

    public double taxRental(){
        return super.totalMonthlyCharge();
    }

    public double insurance(){
        return super.getBoatValue();
    }
}
