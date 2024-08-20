package Interview.Association.ComoAggreg;

public class Car {

    private Engine engine;
    private String model;




    public Car(String engineType, String model) {
        this.engine = new Engine(engineType);   //Composite here Car own an engine
        this.model = model;
    }

    public void startCar(){
     System.out.println(model+" is starting ...");
     engine.startEngine();
    }

    public void stopCar(){
        System.out.println(model+" is stoping ...");
        engine.stopEngine();

    }


    public static void main(String[] args) {

        Car car = new Car("Electric", "Tata");

        car.startCar();
        car.stopCar();
    }
}
