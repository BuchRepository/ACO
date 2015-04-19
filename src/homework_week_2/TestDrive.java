package homework_week_2;
import java.lang.String;

public class TestDrive {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[6];

        vehicles[0] = new Vehicle("Opel", "astra", "auto", "purple");
        vehicles[1] = new Vehicle("BMW", "320i", "auto", "Black");
        vehicles[2] = new Vehicle("Mersdes", "e220", "auto", "Black");
        vehicles[3] = new Vehicle("Daewoo", "Lanos", "auto", "Green");
        vehicles[4] = new Vehicle("Ford", "Focus", "auto", "Blue");
        vehicles[5] = new Vehicle("Honda", "CB400", "moto", "black");

        ParkingPlace [] parkingPlacePetrovka=new ParkingPlace[5];
        parkingPlacePetrovka[0]= new ParkingPlace(1, vehicles[0]);
        parkingPlacePetrovka[1]= new ParkingPlace(2, vehicles[1]);
        parkingPlacePetrovka[2]= new ParkingPlace(3, vehicles[2]);

        ParkingPlace [] parkingPlaceTroeschina=new ParkingPlace[5];
        parkingPlaceTroeschina[0]= new ParkingPlace(1, vehicles[3]);
        parkingPlaceTroeschina[1]= new ParkingPlace(2, vehicles[4]);
        parkingPlaceTroeschina[2]= new ParkingPlace(3, vehicles[5]);

        Parking [] parking = new Parking[2];
        parking[0]=new Parking("Petrovka", parkingPlacePetrovka);
        parking[1]=new Parking("Troeschina", parkingPlaceTroeschina);


        System.out.println(vehicles[3].getModel());
        System.out.println(parking[0].getName());
        vehicles[5].show(vehicles[2]);
        vehicles[4].findModel(vehicles[3]);
        System.out.println(parkingPlaceTroeschina[0].getVehicle());
        System.out.println(parking[0].addCar(parkingPlacePetrovka[1]));
        System.out.println(parking[1].addCar(parkingPlaceTroeschina[1]));
        System.out.println(parking[0].countParkingPlace(parking[0]));
        parking[0].infoVehicleOnPlace(parking[0], parkingPlacePetrovka[2]);
        parking[0].infoAllVehicleOnPlace(parking[1]);
    }

}