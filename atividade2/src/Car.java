public class Car {

    private String brand;
    private int yearOfManuFacture;
    private CarType carType;
    /* LISTA DE ATRIBUTOS DO CARRO
     * - licensePlate
     * - chassisNumber
     * - model
     * - brand
     * - yearOfManufacture
     * - price
     *
     * DISTRIBUA OS ATRIBUTOS ENTRE Car E CarType, OBSERVANDO A NATUREZA DE CADA ATRIBUTO
     * */

    // CONSTRUTOR
    public Car(CarType carType) {
        this.carType = carType;
    }
}