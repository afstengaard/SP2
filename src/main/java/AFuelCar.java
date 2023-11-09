public abstract class AFuelCar extends ACar{
    private final int kmPrLitre;

    AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber,make,model,numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract public String getFuelType();

    public int getKmPrLitre(){
        return kmPrLitre;
    }

}
