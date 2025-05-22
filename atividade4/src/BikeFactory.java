
public class BikeFactory extends TransportFactory{
    /*
        Coloque o extends que falta
     */

    @Override
    public Transport createTransport(){
        return new Bike();
    }
}