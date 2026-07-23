/*3. Implement a Java program to define a class called ‘Mobilephone’ with Model
Number, Manufacture Name, Cost, Size, Color,
MemoryCapacity,CameraPixelSize, as instance variables.. Include various types
of constructors such as Default constructor, Parameterized constructor with two
arguments, three arguments and four arguments. Create objects to invoke
various types of constructors and demonstrate polymorphism.*/

class Mobilephone{
    int model_number;
    String Manufacturer_name;
    String colour;
    double cost;
    int memory;
    int pixelsize;
    //Default constructor;
    Mobilephone(){
        model_number=001;
        Manufacturer_name="SAMSUNG";
        colour="BLUE";
        cost=24999.86;
        memory=128;
        pixelsize=50;
    }
    //Parameterized constructor with two arguments
    Mobilephone(int no,int memory){
	model_number=no;
	this.memory=memory;
    }
    //Parameterized constructor with three arguments
    Mobilephone(String colour,String Manufacturer_name,double cost){
	this.colour=colour;
	this.Manufacturer_name=Manufacturer_name;
	this.cost=cost;
    }
    //Parameterized constructor with four arguments
    Mobilephone(int pixelsize,int model_number,double cost,String colour){
	this.pixelsize=pixelsize;
	this.model_number=model_number;
	this.cost=cost;
	this.colour=colour;
    }
    //method to print the values
    void display(){
        System.out.println("------DETAILS------");
	System.out.println("MODEL NUMBER: "+model_number);
	System.out.println("MANUFACTURER NAME: "+Manufacturer_name);
	System.out.println("COLOUR	: "+colour);
	System.out.println("COST        : "+cost);
	System.out.println("MEMORY	: "+memory);
	System.out.println("PIXEL SIZE	: "+pixelsize);

    }
}
class MobileDemo{
    public static void main(String args[]){
	Mobilephone m1=new Mobilephone();
	Mobilephone m2=new Mobilephone(002,100);
	Mobilephone m3=new Mobilephone("BLACK","REDMI",45000.0);
	Mobilephone m4=new Mobilephone(64,003,399999.34,"WHITE");
	m1.display();
	m2.display();
	m3.display();
	m4.display();
    }
}
