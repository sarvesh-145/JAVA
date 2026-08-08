package shape3d;
import shape2d.Shape2d;
public abstract class Shape3d extends Shape2d{
    public Shape3d(String name){
        super(name);
    }
    public abstract double calculate();
    public void display() {
        System.out.println("NAME OF THE SHAPE: " + name + "\nVOLUME OF THE SHAPE: " + calculate());
    }
}