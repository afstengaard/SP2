public class DieselCar extends AFuelCar{
    private final boolean particleFilter;

    DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }


    public boolean hasParticleFilter(){
        return particleFilter;
    }

    public int getRegistrationFee() {
        int particleFilterFee = 0;
        if(!particleFilter){
            particleFilterFee = 1000;
        }

        if(getKmPrLitre() > 20){
            return 130 + particleFilterFee;
        }else if(getKmPrLitre() > 15){
            return 1390 + particleFilterFee;
        }else if(getKmPrLitre() > 10){
            return 1850 + particleFilterFee;
        }else if(getKmPrLitre() > 5){
            return 2770 + particleFilterFee;
        } else {
            return 15260 + particleFilterFee;
        }
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public String toString() {
        String carStats = "";
        carStats = carStats.concat("The cars make is " + getMake());
        carStats = carStats.concat("\n The model is: " + getModel());
        carStats = carStats.concat("\n There are " + getNumberOfDoors() + " doors.");
        carStats = carStats.concat("\n It costs " + getRegistrationFee() + "kr. to register the car");
        carStats = carStats.concat("\n The license plate is " + getRegistrationNumber());
        carStats = carStats.concat("\n The car runs on diesel, and the mileage is " + getKmPrLitre() + " km/l.");
        carStats = carStats.concat("\n Does it have a particle filter? " + hasParticleFilter());
        return carStats;
    }
}
