import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.of;


/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(50);

        LocalDateTime entryCar = of(2019, 5, 18, 11, 10,11);
        LocalDateTime exitCar = of(2019, 5, 18, 14, 40,11);

        LocalDateTime entryTruck = of(2019, 5, 17, 9, 01,44);
        LocalDateTime exitTruck = of(2019, 5, 17, 21, 56,11);

        try {
            Vehicle car = parking.setNewVehicle(Typology.CAR, entryCar, exitCar);

            if (car != null) {
                System.out.println("Vehicle added successfully: there are other " + parking.getSpaces() + " seats free.");
            } else {
                System.out.println("Car Park is full.");
            }

            System.out.println("This vehicle has to pay " + parking.getPrice(car) + ".\n");


            Vehicle truck = parking.setNewVehicle(Typology.TRUCK, entryTruck, exitTruck);

            if (truck != null) {
                System.out.println("Vehicle added successfully: there are other " + parking.getSpaces() + " seats free.");
            } else {
                System.out.println("Car Park is full.");
            }

            System.out.println("This vehicle has to pay " + parking.getPrice(truck) + ".\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}