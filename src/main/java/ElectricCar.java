public class ElectricCar extends ACar {
    private int batteryCapacity;
    private int maxRange;

    ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRange(){
        return maxRange;
    }

    public int getWhPrKm(){
        return batteryCapacity*1000/maxRange;
    }

    @Override
    public String toString() {
        String carStats = "";
        carStats = carStats.concat("The cars make is " + getMake());
        carStats = carStats.concat("\n The model is: " + getModel());
        carStats = carStats.concat("\n There are " + getNumberOfDoors() + " doors.");
        carStats = carStats.concat("\n It costs " + getRegistrationFee() + "kr. to register the car");
        carStats = carStats.concat("\n The license plate is " + getRegistrationNumber());
        carStats = carStats.concat("\n The car is electric, it has a battery capacity of " + getBatteryCapacityKWh() + "KWh, and its range is " + getMaxRange() + "km.");

        return carStats;
    }

    @Override
    public int getRegistrationFee() {
        double mileageNumber = 100/(batteryCapacity*1000/maxRange/91.25);
        if(mileageNumber > 20){
            return 330;
        }else if(mileageNumber > 15){
            return 1030;
        }else if(mileageNumber > 10){
            return 2340;
        }else if(mileageNumber > 5){
            return 5500;
        } else {
            return 10470;
        }
    }
}
