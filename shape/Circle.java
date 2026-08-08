package shape2d;
class Circle extends Shape2d{
    double radius;
    public Circle(String name,double radius){
        super(name);
        this.radius=radius;
    }
    double calculate(){
        return 3.14*Math.pow(radius,2);
    }
}