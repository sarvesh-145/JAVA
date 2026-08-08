package shape3d;
public class Cube extends Shape3d{
    double side;
    public Cube(String name,double side){
        super(name);
        this.side=side;
}
    double calculate(){
        return Math.pow(side,3);
    }
}