
public class CarFactory extends TransportFactory {
    /*
        Coloque o extends que falta
     */

    @Override
    public Transport createTransport(){
        return new Car();
    }
}