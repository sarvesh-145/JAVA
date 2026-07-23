//Program to print the details of student
class Student{
    int rollno;
    String name;
    String department;
    void displayStudentDetails(){ //method to display the details
	System.out.println("ROLL NUMBER: "+rollno);
	System.out.println("NAME: "+name);
	System.out.println("DEPARTMENT: "+department);
    }
}
class StudentDemo{
    public static void main(String args[]){
    	//creating object
    	Student s=new Student();
    	s.rollno=35;
   	s.name="sarveshhwaran";
   	s.department="CSEiot&a";
    	//calling the method
    	s.displayStudentDetails();
    }
}
