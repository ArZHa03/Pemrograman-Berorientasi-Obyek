public class Boat {
    private String name;
    private double height, length, width, boatValue, chargeRate = 10;
    private SailBoat sailBoat;
    private MotorBoat motorBoat;

    Boat(String name, double height, double length, double width){
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSailBoat(SailBoat sailBoat){
        this.sailBoat = sailBoat;
    }

    public void setMotorBoat(MotorBoat motorBoat){
        this.motorBoat = motorBoat;
    }

    public void setBoatValue(){
        if(sailBoat != null){
            this.boatValue = (this.sum() + sailBoat.totalMonthlyCharge()) * 0.0005;
        }else{
            this.boatValue = (this.sum() + motorBoat.totalMonthlyCharge()) * 0.0005;
        }
    }

    public String getName(){
        return this.name;
    }

    public double getBoatValue(){
        this.setBoatValue();
        return this.boatValue;
    }

    public double totalMonthlyCharge(){
        return sailBoat != null ? this.sum() + sailBoat.totalMonthlyCharge() + this.getBoatValue() : (this.sum() + motorBoat.totalMonthlyCharge()) + this.getBoatValue();
    }

    private double sum(){
        return height * length * width * chargeRate;
    }
}
