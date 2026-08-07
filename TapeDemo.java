import p1.Publication;
import p2.Tape;
import p2.Book;
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