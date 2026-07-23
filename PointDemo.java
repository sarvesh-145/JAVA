/*2. Create a Point class that has two data members x and y of double type. Write
a default constructor which initializes its data members to zero. Write a
parameterized constructor which takes two parameters of double type and
assigns them to its data members. Write another parameterized constructor that
takes one Point object as parameter and copies the values of the passed object’s
data member to the calling object’s data members. Write a find_distance method
that takes two double parameters representing the x, y values of a point and
finds the distance between the calling object and the passed parameters and
returns the distance as double value. Overload the find_distance method, that
takes single Point object parameter and computes the distance between both the
points and returns the distance as a double value. Write a display method to
print the point in the format of “(x, y)”. In main method create three point
objects p1, p2 and p3. Initialize p1 with (3.25, 7.89), p2 with (5.37, 18.12) and
p3 with p2. Find distance between p1 and (7.9, 16.25) using first find_distance
method and between p1 and p3 using secondfind_distancemethod.*/

class Point{
    double x;
    double y;
    //default constructor
    Point(){
	x=0;
	y=0;
    }
    //parameterized constructor 
    Point(double x,double y){
        this.x=x;
	this.y=y;
    } 
    //copy constructor
    Point(Point p){
	x=p.x;
	y=p.y;
    }
    //method to calcualte distance
    double find_distance(double a,double b){
	double dist=Math.sqrt(Math.pow(x-a,2)+Math.pow(x-b,2));
	return dist;
    }
    //overloaded method to calcualte distance with object as parameter
    double find_distance(Point q){
	double dist=Math.sqrt(Math.pow(x-q.x,2)+Math.pow(x-q.y,2));
	return dist;
    }
    //method to display the values
    void display(){
	System.out.println("("+x+","+y+")");
    }
}
class PointDemo{
    public static void main(String args[]){
	//instantiating objects
	Point p1=new Point(3.25, 7.89);
	Point p2=new Point(5.37, 18.12);
	Point p3=new Point(p2);	
	//printing the values of the points
	System.out.println("THE VALUE OF P1=");
	p1.display();
	System.out.println("THE VALUE OF P2=");
	p2.display();
	System.out.println("THE VALUE OF P3=");
	p3.display();
	//calling the find_distance method
	double d1=p1.find_distance(7.9, 16.25);
	System.out.println("THE DISTANCE BETWEEN P1 AND (7.9, 16.25) IS="+d1);
	//calling the overloaded find_distance method
	double d2=p1.find_distance(p3);
	System.out.println("THE DISTANCE BETWEEN P1 AND P3 IS="+d2);
    }
}
