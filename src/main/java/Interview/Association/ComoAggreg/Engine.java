package Interview.Association.ComoAggreg;

public class Engine {

    private String type;

    public Engine(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }


    public void startEngine(){
        System.out.println("Engine Started");
    }

    public void stopEngine(){
        System.out.println("Engine Stopped");
    }
}


