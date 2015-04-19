package homework_week_2;

public class ParkingPlace {
    private int placeNumber;
    private  Vehicle vehicle;

    public ParkingPlace(int placeNumber, Vehicle vehicle) {
        this.placeNumber = placeNumber;
        this.vehicle=vehicle;
    }

    public int getNumber() {
        return placeNumber;
    }

    public void setNumber(int number) {
        this.placeNumber = number;
    }

    public Vehicle getVehicle() {
        return vehicle;

    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
