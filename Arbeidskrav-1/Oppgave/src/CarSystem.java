import java.text.ParseException;
import java.util.*;

public class CarSystem {

    private static HashMap<Person, ArrayList<Vehicle>> cars = new HashMap<>();

    CarSystem(){
        try {
            create();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void create() throws ParseException {
        Person person1 = new Person(1, "Hans Hansen", 1982);
        Person person2 = new Person(2, "Truls Pettersen", 1992);

        Vehicle car1 = new Van("Nissan", "ARIYA", 2020, 23351, Utils.parseDate("2022-01-01"));
        Vehicle car2 = new PassengerCar("KIA", "e-Soul", 2021,37554, Utils.parseDate("2022-02-23"));
        Vehicle car3 = new Truck("Volvo", "FH16", 2022,583, Utils.parseDate("2022-02-24"));

        addNewEntry(person1, new Vehicle[] {car1, car2});
        addNewEntry(person2, new Vehicle[] {car3});
    }

    private void addNewEntry(Person person, Vehicle[] vehicles){
        ArrayList<Vehicle> carList = new ArrayList<>(Arrays.asList(vehicles));
        cars.put(person, carList);
    }

    public void print(){

        List<Integer> ages = new ArrayList<>();
        List<Integer> productionYears = new ArrayList<>();
        List<Integer> mileages = new ArrayList<>();

        for (Map.Entry entry : cars.entrySet()){
            Person person = (Person)entry.getKey();
            System.out.println(person);

            ages.add(Utils.parseAge(person.getYearOfBirth()));

            List<Vehicle> carCollection = (ArrayList<Vehicle>)entry.getValue();

            System.out.println("    Cars: ");

            for (int i = 0; i != carCollection.size(); i++){
                Vehicle vehicle = carCollection.get(i);
                System.out.println(vehicle);

                productionYears.add(Utils.parseAge(vehicle.getProductionYear()));
                mileages.add(vehicle.getMileage());
            }
        }

        System.out.println("Average age of persons: " + Utils.calculateAverage(ages));
        System.out.println("Average age of cars: " + Utils.calculateAverage(productionYears));
        System.out.println("Average mileage of cars: " + Utils.calculateAverage(mileages));
    }
}