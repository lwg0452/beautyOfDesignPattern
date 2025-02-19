package Bridge;

public class Car extends AbstractCar{

    public Car(Brand brand, Transmission transmission) {
        super(brand, transmission);
    }

    @Override
    public void showCar() {
        this.brand.showBrand();
        this.transmission.showTransmission();
    }

    public void run() {
        System.out.println("I am running.");
    }

    public static void main(String[] args) {
        Car car = new Car(new Audi(), new AutoTransmission());
        car.showCar();
    }
}
