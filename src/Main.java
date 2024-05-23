public class Main {
    public static void main(String[] args) {

        CarFactory popularFactory = new PopularCarFactory();
        CarStore popularStore = new CarStore(popularFactory);

        System.out.println(popularStore.orderSedan());
        System.out.println(popularStore.orderSUV());


        CarFactory luxuryFactory = new LuxuryCarFactory();
        CarStore luxuryStore = new CarStore(luxuryFactory);

        System.out.println(luxuryStore.orderSedan());
        System.out.println(luxuryStore.orderSUV());
    }
}
