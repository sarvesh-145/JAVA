package shape2d;
public abstract class Shape2d{
    public String name;
    public Shape2d(String name){
        this.name = name;
    }
    public abstract double calculate();
    public void display(){
        System.out.println("NAME OF THE SHAPE: "+name+"\nAREA OF THE SHAPE: "+calculate());
    }
}