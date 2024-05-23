public class LuxuryCarFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new LuxurySedan();
    }

    @Override
    public SUV createSUV() {
        return new LuxurySUV();
    }
}