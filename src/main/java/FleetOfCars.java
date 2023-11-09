import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet(){
        int totalRegFee = 0;
        for(Car c:fleet){
            totalRegFee += c.getRegistrationFee();
        }
        return totalRegFee;
    }

    @Override
    public String toString() {
        String carFleet = "Cars currently available: \n";
        for(Car c:fleet){
            carFleet = carFleet.concat(c.toString());
        }
        return carFleet;
    }
}
