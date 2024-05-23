public class PopularCarFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new PopularSedan();
    }

    @Override
    public SUV createSUV() {
        return new PopularSUV();
    }
}