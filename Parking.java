import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Parking
 */
public class Parking {
    private int spaces;
    private ArrayList<Vehicle> vehicles;

    public Parking(int sapces) {
        this.spaces = sapces;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public int getSpaces() {
        return spaces;
    }
    
    public Vehicle setNewVehicle(Typology type, LocalDateTime entry, LocalDateTime exit) throws Exception {
        if (this.spaces == 0) return null;
        if (entry.isAfter(exit)) throw new Exception("La data di ingresso è maggiore della data di uscita");
        Vehicle vehicle = new Vehicle(type, entry, exit);
        this.vehicles.add(vehicle);
        if (type.equals(Typology.TRUCK)) {
            this.spaces -= 3;
        } else {
            this.spaces--;
        }
        return vehicle;
    }

    public double getPrice(Vehicle vehicle) {
        double price;
        int hours = vehicle.getExit().getHour() - vehicle.getEntry().getHour();
        int minutes = (hours * 60) + vehicle.getExit().getMinute() - vehicle.getEntry().getMinute();
        System.out.println(hours + " " + minutes);
        if (minutes < 120) {
            price = minutes * 0.01;
        } else if (minutes >= 120 && minutes <= 420) {
            price = 2 + (minutes * 0.01);
        } else {
            price = 6;
        }
        return price;
    }
}