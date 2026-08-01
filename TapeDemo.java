/*2. Create a class Publication that stores the title (String) and price (float) of a
publication.
From this class, derive two classes:
 Book, which adds a page count (int)
 Tape, which adds a playing time in minutes (float)
Each of these three classes should have:
 getData() method to initialize the data.
 putData() method to display the data.
Write a Java program to test the Book and Tape classes by creating five instances,
accepting input from the user using getData(), and displaying the details using
putData().*/

import java.util.Scanner;
//super class
class Publication{
    String title;
    float price;
    Scanner sc=new Scanner(System.in);
    //method to initialize data
    void getData(){
	System.out.println("ENTER THE NAME OF THE BOOK: ");
	title=sc.nextLine();
	System.out.println("ENTER THE PRICE OF THE BOOK: ");
   	price=sc.nextFloat();
	sc.nextLine();
    }
    //method to stream the data
    void putData(){
	System.out.println("TITLE: "+title);
	System.out.println("PRICE: "+price);
    }
}
//sub class Book extending super class
class Book extends Publication{
    int page_count;
    //method to initialize data
    void getData(){
	super.getData();
	System.out.println("ENTER THE PAGE COUNT OF THE BOOK: ");
   	page_count=sc.nextInt();
        sc.nextLine();
    }
    //method to stream the data
    void putData(){
	super.putData();
	System.out.println("PAGE COUNT: "+page_count);
    }
}
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
class TapeDemo{
    public static void main(String args[]){
	Book b[]=new Book[5];
	Tape t[]=new Tape[5];
	for(int i=0;i<5;i++){
	    b[i]=new Book();
	    b[i].getData();
	}
	for(int i=0;i<5;i++){
	    t[i]=new Tape();
	    t[i].getData();
	}
	for(int i=0;i<5;i++){
	    b[i].putData();
	}
	for(int i=0;i<5;i++){
	    t[i].putData();
	}
    }
}
