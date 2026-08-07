
package p2;
import p1.Publication;
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
