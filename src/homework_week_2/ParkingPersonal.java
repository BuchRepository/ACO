package homework_week_2;


public class ParkingPersonal {
    String name;
    int age;
    Parking parking;

    public ParkingPersonal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  /*  public boolean parkingCar(Vehicle vehicle){
        boolean added = false;
        for (int i = 0; i <parking.parkingPlace ; i++) {

        }
        }
        System.out.println("countcar"+countCar);
        return added;

    }
*/
}
