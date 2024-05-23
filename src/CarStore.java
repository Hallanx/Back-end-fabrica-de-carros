public class CarStore {
    private CarFactory factory;

    public CarStore(CarFactory factory) {
        this.factory = factory;
    }

    public String orderSedan() {
        Sedan sedan = factory.createSedan();
        return sedan.info();
    }

    public String orderSUV() {
        SUV suv = factory.createSUV();
        return suv.info();
    }
}
