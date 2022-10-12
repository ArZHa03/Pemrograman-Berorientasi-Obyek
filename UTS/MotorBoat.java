public class MotorBoat extends Boat{
    private double horsePower, tax = 0.1;

    MotorBoat(String name, double height, double length, double width, double horsePower){
        super(name, height, length, width);
        this.horsePower = horsePower;
        BoatStorage.countMotorBoat++;
    }

    public double totalMonthlyCharge(){
        setMotorBoat(this);
        return this.horsePower * tax;
    }

    public double taxRental(){
        return super.totalMonthlyCharge();
    }

    public double insurance(){
        return super.getBoatValue();
    }
}
