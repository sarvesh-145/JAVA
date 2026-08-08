package shape2d;
class Rectangle extends Shape2d{
    double length;
    double breadth;
    public Rectangle(String name,double length,double breadth){
        super(name);
        this.length=length;
        this.breadth=breadth;
    }
    double calculate(){
        return length*breadth;
    }
}