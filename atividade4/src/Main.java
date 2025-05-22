

public class Main {
    public static void main(String[] args) {
        TransportFactory factory;

        factory = new CarFactory();
        Transport car = factory.createTransport();
        car.deliver();

        factory = new BikeFactory();
        Transport bike = factory.createTransport();
        bike.deliver();
    }
}