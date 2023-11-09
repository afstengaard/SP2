public class GasolineCar extends AFuelCar{


    GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        if(getKmPrLitre() > 20){
            return 330;
        }else if(getKmPrLitre() > 15){
            return 1030;
        }else if(getKmPrLitre() > 10){
            return 2340;
        }else if(getKmPrLitre() > 5){
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        String carStats = "";
        carStats = carStats.concat("The cars make is " + getMake());
        carStats = carStats.concat("\n The model is: " + getModel());
        carStats = carStats.concat("\n There are " + getNumberOfDoors() + " doors.");
        carStats = carStats.concat("\n It costs " + getRegistrationFee() + "kr. to register the car");
        carStats = carStats.concat("\n The license plate is " + getRegistrationNumber());
        carStats = carStats.concat("\n The car runs on gas, and the mileage is " + getKmPrLitre() + " km/l.");
        return carStats;
    }
}
