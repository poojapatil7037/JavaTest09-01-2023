


class Car {
    //
    Engine engine = new Engine("Blue","Car",100);
    String model;
    Car(String model, Engine engine){
        this.model=model;
        this.engine=engine;

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", model='" + model + '\'' +
                '}';
    }


 //public void display() {
   //   System.out.println(toString());
    //}
}
public class HasArelation {
    public static void main(String[] args) {
        Engine engine= new Engine("blue","UI",200);
       Car car= new Car("ABC",engine);
    String s1=car.toString();
        System.out.println(s1);

    }
}
