package Bridge;

public class Car {

    private Brand brand;
    private Transmission transmission;

    public Car(Brand brand, Transmission transmission) {
        this.brand = brand;
        this.transmission = transmission;
    }

    public void showCar() {
        brand.showBrand();
        transmission.showTransmission();
    }

    public static void main(String[] args) {
        Car car = new Car(new Audi(), new AutoTransmission());
        car.showCar();
    }
}
