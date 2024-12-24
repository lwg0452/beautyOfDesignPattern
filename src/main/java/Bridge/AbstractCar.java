package Bridge;

public abstract class AbstractCar {

    protected Brand brand;
    protected Transmission transmission;

    public AbstractCar(Brand brand, Transmission transmission) {
        this.brand = brand;
        this.transmission = transmission;
    }

    public abstract void showCar();
}
