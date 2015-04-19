package homework_week_2;

import java.lang.String;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Parking {

    private String name;
    private ParkingPlace[] parkingPlace=new ParkingPlace[5];
    private int countCar=parkingPlace.length;

    public Parking (String name ) {
        this.name=name;
    }

    public Parking(String name, ParkingPlace [] parkingPlace) {
        this.name = name;
        this.parkingPlace=parkingPlace;
    }

    public int getCountCar() {
        return countCar;
    }

    public void setCountCar(int countCar) {
        this.countCar = countCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Added vehicle on parkings place
    public boolean addCar(ParkingPlace parkingplace) {
        boolean added = false;
        if (countCar < parkingPlace.length) {
            parkingPlace[countCar] = parkingplace;
            countCar++;
            added = true;
        }
        System.out.println("countcar"+countCar);
        return added;
    }
    //Amount parking place on parking
    public int countParkingPlace (Parking parking) {
        int freePlace = parkingPlace.length - countCar;//call count element array parkingPlace and subtract parking size
        System.out.print("Amount free places on parking "+freePlace);
        return (freePlace);
    }
    //Info about choices TS on this parking place
    public void infoVehicleOnPlace (Parking parking, ParkingPlace parkingplace) {
        System.out.println("Info about TS on place:  "+parking.getName()+" and"+ parkingplace.getNumber()+"place is booking " +
                           parkingplace.getVehicle()+" ");
    }
    //Info about all booking place by vehicle
    public void infoAllVehicleOnPlace (Parking parking) {
        for (int i = 0; i <countCar ; i++) {
            if (parkingPlace[i] != null) {
                System.out.println("Info about all car:  "+parkingPlace[i].getNumber()+"th place is booking "+parkingPlace[i].getVehicle());
            }
        }
    }

    public void timework()
    {   LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localTime); // 15:06:58.074


        localTime = localTime.minusMinutes(60)
                .plusHours(1)
                .plusSeconds(90)
                .minusMinutes(1);

        localDate = localDate.minusYears(1)
                .plusMonths(12)
                .minusDays(365)
                .plusYears(1);

        localDateTime = localDateTime.minusMinutes(60)
                .plusHours(1)
                .minusMinutes(1)
                .plusSeconds(60)
                .plusMonths(12)
                .minusYears(1)
                .minusDays(365)
                .plusYears(1);

        System.out.println(localTime.plusHours(2)); // 15:06:58.074
        System.out.println(localDate); // 2014-06-30
        System.out.println(localDateTime); // 2014-06-30T15:08:19.809

   // if localTime
    }
}

