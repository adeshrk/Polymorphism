/**
 * Created by Adesh on 06-08-2019
 */
 public class Main{
    public static void main(String[] args) {

        Car car = new Car("Base car",0);
        System.out.println(car.getName());
        car.getCyllinders();
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine()+"\n");

        Tata indigo = new Tata("Indigo",4);
        System.out.println(indigo.getName());
        System.out.println(indigo.getCyllinders());
        System.out.println(indigo.accelerate());
        System.out.println(indigo.brake());
        System.out.println(indigo.startEngine());

    }
}

class Car {
    private int wheels;
    private boolean engine;
    private String name;
    private int cyllinders;

    public Car(String name, int cyllinders) {
        this.wheels = 4;
        this.engine = true;
        this.name = name;
        this.cyllinders = cyllinders;
    }

    public String getName() {
        return "Name -> "+name;
    }

    public String getCyllinders() {
        return "No. of Cyllinders"+cyllinders;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake() {
        return "Car -> brake()";
    }


}

class Tata extends Car{

    public Tata(String name, int cyllinders) {
        super(name, cyllinders);
    }

    @Override
    public String startEngine() {
        return "Tata -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Tata -> startEngine()";
    }

    @Override
    public String brake() {
        return "Tata -> startEngine()";
    }
}