import java.util.Scanner;

class IncorrectInputException extends Exception {
    public IncorrectInputException(String message) {
        super(message);
    }
}

class Book {
    Scanner sc=new Scanner();
    String author;
    String title;
    double price;
    String publisher;
    int stock;
    Book(String author, String title, double price, String publisher, int stock) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.stock = stock;
    }
    void Display(){
        System.out.println("-----DETAILS-----\n\tAuthor: " + author + "\n\tTitle: " + title + "\n\tPrice: " + price + "\n\tPublisher: " + publisher + "\n\tStock position: " + stock);
    }
    Bool FindBook(){
       String sauthor,stitle;
       System.out.println("ENTER THE AUTHOR AND TITLE: ");
       sauthor=sc.nextLine();
       stitle=sc.netLine();
           if(b.author==sauthor&b.title==stitle)
              return true;
          else
              return false;
    }
}
class BookShopDemo{
    Scanner sc=new Scanner();
    Book b[]=new Book[3];
    b[0]=new Book("abc","ABC",300,"a_bc",150);      
    b[1]=new Book("pqr","PQR",800,"p_qr",122);       
    b[2]=new Book("xyz","XYZ",250,"x_yz",300);  
    for(int i=0;i<3;i++)
        b[i].Display();
    for(int i=0;i<3;i++){
        if(b[i].FindBook())
          System.out.println("THE BOOK IS AVAILABLE");
        b[i].Display();
        else
          System.out.println("THE BOOK IS NOT AVAILABLE");
        }
    

}
