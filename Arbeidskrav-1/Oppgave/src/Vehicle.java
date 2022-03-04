import java.util.Date;

enum VehicleType{
    PASSENGERCAR,
    VAN,
    TRUCK
}

class Vehicle {
    private final String producer;
    private final String name;
    private final VehicleType type;
    private final int productionYear;
    private final int mileage;
    private final Date mileageDate;

    Vehicle(String producer, String name, VehicleType type, int productionYear, int mileage, Date mileageDate){
        this.producer = producer;
        this.name = name;
        this.type = type;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.mileageDate = mileageDate;
    }

    public int getProductionYear(){
        return productionYear;
    }

    public int getMileage(){
        return mileage;
    }

    @Override
    public String toString(){
        String output =
                "        Producer: " + producer + System.lineSeparator() +
                        "        Name: " + name + System.lineSeparator() +
                        "        Type: " + type + System.lineSeparator() +
                        "        Production year: " + productionYear + System.lineSeparator() +
                        "        Mileage: " + mileage + System.lineSeparator() +
                        "        Mileage date: " + mileageDate + System.lineSeparator();

        return output;
    }

}

class PassengerCar extends Vehicle{
    PassengerCar(String producer, String name, int productionYear, int mileage, Date mileageDate){
        super(producer, name, VehicleType.PASSENGERCAR, productionYear, mileage, mileageDate);
    }
}

class Truck extends Vehicle{
    Truck(String producer, String name, int productionYear, int mileage, Date mileageDate){
        super(producer, name, VehicleType.TRUCK, productionYear, mileage, mileageDate);
    }
}

class Van extends Vehicle{
    Van(String producer, String name, int productionYear, int mileage, Date mileageDate){
        super(producer, name, VehicleType.VAN, productionYear, mileage, mileageDate);
    }
}