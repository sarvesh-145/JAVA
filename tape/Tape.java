package p2;
import java.util.Scanner;
import p1.Publication;
Scanner sc=new Scanner(System.in);
//sub class Tape extending super class
class Tape extends Publication{
    float mins;
    //method to initialize data
    void getData(){
	super.getData();
	System.out.println("ENTER THE PLAYING TIME IN MINS: ");
   	mins=sc.nextFloat();
        sc.nextLine();
    }
    //method to stream the data
    void putData(){
	super.putData();
	System.out.println("PLAYING TIME: "+mins);
    }
}