import java.util.*;

public class Owner {
    private int idOwner;
    private String name, address;
    private ArrayList <SailBoat> sailBoat;
    private ArrayList <MotorBoat> motorBoat;

    Owner(String name, String address){
        this.idOwner = ++BoatStorage.id;
        this.name = name;
        this.address = address;
        this.sailBoat = new ArrayList<SailBoat>();
        this.motorBoat = new ArrayList<MotorBoat>();
    }

    public void setBoat(Boat boat){
        if(boat instanceof SailBoat){
            this.sailBoat.add((SailBoat) boat);
        }else if(boat instanceof MotorBoat){
            this.motorBoat.add((MotorBoat) boat);
        }
    }

    public int getIdOwner(){
        return this.idOwner;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public SailBoat getSailBoat(int i){
        return this.sailBoat.get(i);
    }

    public MotorBoat getMotorBoat(int i){
        return this.motorBoat.get(i);
    }

    public ArrayList<SailBoat> getAllSailBoat(){
        return this.sailBoat;
    }

    public ArrayList<MotorBoat> getAllMotorBoat(){
        return this.motorBoat;
    }

    public double totalInsurance(){
        double total = 0;
        for(int i = 0; i < sailBoat.size(); i++){
            total += sailBoat.get(i).taxRental();
        }
        for(int i = 0; i < motorBoat.size(); i++){
            total += motorBoat.get(i).taxRental();
        }
        return total;
    }
}
