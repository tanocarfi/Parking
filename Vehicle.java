import java.time.LocalDateTime;

enum Typology {
    CAR,
    TRUCK;
}

/**
 * Vehicle
 */
public class Vehicle {
    private Typology type;
    private LocalDateTime entry;
    private LocalDateTime exit;

    public Vehicle(Typology type, LocalDateTime entry, LocalDateTime exit) {
        this.type = type;
        this.entry = entry;
        this.exit = exit;
    }

    public Typology getType() {
        return type;
    }

    public void setType(Typology type) {
        this.type = type;
    }

    public LocalDateTime getEntry() {
        return entry;
    }

    public void setEntry(LocalDateTime entry) {
        this.entry = entry;
    }

    public LocalDateTime getExit() {
        return exit;
    }

    public void setExit(LocalDateTime exit) {
        this.exit = exit;
    }
}
