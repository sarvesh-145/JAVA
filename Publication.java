/*3. Create a package named p1 containing a class Publication that stores the
following details:
 title (String)
 price (float)
From the Publication class, derive two classes stored in another package named p2:
 Book, which adds a pageCount (int).
 Tape, which adds a playingTime (float) in minutes.
Each of the three classes should provide the following methods:
 getData() – to initialize the data members.
 putData() – to display the data members.
Write a Java program that imports both packages p1 and p2, creates objects of Book and
Tape, accepts input using getData(), and displays the details using putData().*/

package p1;
import java.util.Scanner;
public class Publication{
    String title;
    float price;
    public Scanner sc=new Scanner(System.in);
    //method to initialize data
    public void getData(){
	System.out.println("ENTER THE NAME OF THE BOOK: ");
	title=sc.nextLine();
	System.out.println("ENTER THE PRICE OF THE BOOK: ");
   	price=sc.nextFloat();
	sc.nextLine();
    }
    //method to stream the data
    public void putData(){
	System.out.println("TITLE: "+title);
	System.out.println("PRICE: "+price);
    }
}