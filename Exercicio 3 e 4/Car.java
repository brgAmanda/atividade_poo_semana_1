public class Car {

    //atributos
    private String carBrand;
    private String carPlate;

    //métodos
    public void openDoor() {
        System.out.println("A porta do " + this.carBrand + " abriu");
    }
    
    public void startEngine() {
        System.out.println("O carro " + this.carBrand + " ligou");
    }


    //set and get carBrand
    public void setCarBrand(String
    carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand(String 
    carBrand) {
        return this.carBrand;
    }

    // set and get carPlate
    public void setCarPlate(String
    carPlate) {
        this.carPlate = carPlate;
    }

    public String getCarPlate(String 
    carPlate) {
        return this.carPlate;
    }

    //Constructor
    public Car(String carBrand, String carPlate) {
        setCarBrand(carBrand);
        setCarPlate(carPlate);
    }

}