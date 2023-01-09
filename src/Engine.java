public class Engine {

    String  color,name;
    int capacity;
    Engine(String color,String name,int capacity)
    {
      this.color=color;
      this.name=name;
      this.capacity=capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
