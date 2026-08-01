/*1. Create an abstract class called Shape2d that has two data members of type
double and two abstract methods area() and display().
Create two derived classes Rectangle and Triangle. In both classes, define the
area() method to compute the area of the respective shape and return it as a
double value. Also, define the display() method to display the data members
with appropriate captions along with the calculated area.
Create a class called Shape2dDemo and provide the main() method to instantiate
the objects of Rectangle and Triangle for demonstrating the above classes.*/

//abstract super class
abstract class Shape2d{
    double a;
    double b;
    //parameterized constructor
    Shape2d(double a,double b){
	this.a=a;
	this.b=b;
    }
    //abstract methods
    abstract double area();
    abstract void display();
}
//sub class rectangle extending superclass
class Rectangle extends Shape2d{
    Rectangle(double a,double b){
        super(a,b);
    }
    //method to calculate area
    double area(){
	return a*b;
    }
    //method to display the parameters
    void display(){
	System.out.println("length="+a+" "+"breadth="+b+" "+"area="+area());
    }
}
//sub class triangle extending superclass
class Triangle extends Shape2d{
    Triangle(double a,double b){
        super(a,b);
    }
    //method to calculate area
    double area(){
	return (a*b)/2;
    }
    //method to display the parameters
    void display(){
	System.out.println("base="+a+" "+"height="+b+" "+"area="+area());
    }
}
class Shape2dDemo{
   public static void main(String args[]){
	Rectangle r=new Rectangle(35,45);
	Triangle t=new Triangle(10,20);
	r.area();
	t.area();
	r.display();
	t.display();
    }
}
