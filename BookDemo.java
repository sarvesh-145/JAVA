/*1. Create a class called Book that contains instance variables like BKName,
BKId and BKAuthor, a parameterized constructor to initialize its instance
variables, a method BKUpdateDetails(String name, int id, String author), that
accepts new values for name, Id and author as parameters and updates the
corresponding instance variable values of that object and another method
BKDisplay() to display the book details. Create a class BookDemo and provide
main method for instantiate a Book object, display the original book details,
update its details with new values, and display the updated book details.*/

//program to update and display the details of book
class Book{
    String BKName;
    int BKId;
    String BKAuthor;
    //parameterised constructor
    Book(String n,int id,String a){
	BKName=n;
	BKId=id;
	BKAuthor=a;
    }
    //method to update the values
    void BKUpdateDetails(String x,int y,String z){
    	BKName=x;
	BKId=y;
	BKAuthor=z;
     }
     //method to display the details
    void BKDisplay(){
	System.out.println("BOOK NAME: "+BKName);
	System.out.println("BOOK ID: "+BKId);
	System.out.println("AUTHOR NAME: "+BKAuthor);
     }
}
class BookDemo{
    public static void main(String args[]){
	Book b=new Book("java",0001,"xyz"); //creating object
	b.BKDisplay();
	b.BKUpdateDetails("cpp",0002,"abc");
	b.BKDisplay();
    }
}
