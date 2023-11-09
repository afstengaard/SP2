public class Main {
    public static void main(String[] args){
        FleetOfCars collection = new FleetOfCars();
        Car tesla1 = new ElectricCar("XD69420","Tesla","Model Y",5,78,533);
        Car tesla2 = new ElectricCar("AB12345","Tesla","Model S",5,100,634);

        Car ferrari1 = new GasolineCar("BO11369","Ferrari","360",3,6);
        Car ferrari2 = new GasolineCar("AA00001","Ferrari","488",3,9);

        Car volkswagen1 = new DieselCar("VW99999","Volwswagen","Passat",5,20,true);
        Car volkswagen2 = new DieselCar("VW10000","Volkswagen","Golf",5,24,true);

        collection.addCar(tesla1);
        collection.addCar(tesla2);
        collection.addCar(ferrari1);
        collection.addCar(ferrari2);
        collection.addCar(volkswagen1);
        collection.addCar(volkswagen2);

        System.out.println(collection.toString());
        System.out.println(collection.getTotalRegistrationFeeForFleet());


    }
}
