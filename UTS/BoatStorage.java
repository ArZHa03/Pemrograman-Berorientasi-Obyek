import java.util.ArrayList;

public class BoatStorage {
    public static int id = 0, countSailBoat = 0, countMotorBoat = 0;
    public static ArrayList <Owner> owner = new ArrayList<Owner>();

    private static void displayOwner(Owner owner){
        for (int i = 0; i < owner.getAllSailBoat().size(); i++) {
            System.out.println("\n-------------- Pemilik " + owner.getIdOwner() + " --------------");
            System.out.println("Nama Kapal: " + owner.getSailBoat(i).getName());
            System.out.println("Nama Pemilik: " + owner.getName());
            System.out.println("Alamat Pemilik: " + owner.getAddress());
            //soal no 3
            System.out.println("Total Biaya layar: " + owner.getSailBoat(i).totalMonthlyCharge());
            System.out.println("total Asuransi: " + owner.getSailBoat(i).insurance());
            System.out.println("Total Biaya gudang: " + owner.getSailBoat(i).taxRental());
        }
        for (int i = 0; i < owner.getAllMotorBoat().size(); i++) {
            System.out.println("\n-------------- Pemilik " + owner.getIdOwner() + " --------------");
            System.out.println("Nama Kapal: " + owner.getMotorBoat(i).getName());
            System.out.println("Nama Pemilik: " + owner.getName());
            System.out.println("Alamat Pemilik: " + owner.getAddress());
            // soal no 3
            System.out.println("Total Kebakaran: " + owner.getMotorBoat(i).totalMonthlyCharge());
            System.out.println("total Asuransi: " + owner.getMotorBoat(i).insurance());
            System.out.println("Total Biaya Gudang: " + owner.getMotorBoat(i).taxRental());
        }
    }

    public static void main(String[] args) {
        double totalInsurance = 0;
        Owner owner1 = new Owner("Doe", "Rahasia");
        Owner owner2 = new Owner("John", "MauTau?");

        owner.add(owner1);
        owner.add(owner2);

        SailBoat sailBoat1 = new SailBoat("Layer Board Xi", 7.8, 8, 10, 10, 10);
        owner1.setBoat(sailBoat1);
        sailBoat1 = new SailBoat("Layer Board 2XI Ultra", 27.3, 29, 20, 30, 30);
        owner1.setBoat(sailBoat1);

        MotorBoat motorBoat1 = new MotorBoat("Motor Board Envy", 7, 7, 7, 14);
        owner1.setBoat(motorBoat1);
        owner2.setBoat(motorBoat1);

        displayOwner(owner1);
        displayOwner(owner2);

        System.out.println("\n-------------- Total Semua Detail Biaya --------------");
        System.out.println("Total biaya pemilik " + owner1.getIdOwner() + " adalah " + owner1.totalInsurance());
        System.out.println("Total biaya pemilik " + owner2.getIdOwner() + " adalah " + owner2.totalInsurance());
        System.out.println("Total Sail Boat : " + BoatStorage.countSailBoat);
        System.out.println("Total Motor Boat : " + BoatStorage.countMotorBoat);
        System.out.println("Total jumlah kapal : " + (BoatStorage.countSailBoat + BoatStorage.countMotorBoat));


        for (Owner o : owner) {
            totalInsurance += o.totalInsurance();
        }
        System.out.printf("\nTotal biaya seluruh kapal di gudang adalah %.2f", totalInsurance);

        System.out.print("\nList nama penyewa: ");
        for (int i = 0; i < owner.size(); i++) {
            System.out.print(owner.get(i).getName());
            if(i != owner.size() - 1) {
                System.out.print(", ");
            }
        }

        owner1.getAllSailBoat().get(countMotorBoat-1).setName("Broken Board Collection");
        System.out.println("\n\nNama kapal pemilik " + owner1.getIdOwner() + " (" + owner1.getName() + ") " + "menjadi " + owner1.getAllSailBoat().get(countMotorBoat-1).getName());

        displayOwner(owner1);
    }

}
