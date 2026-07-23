//program to manage the details of an employee using a class and an object
import java.util.Scanner;
class Employee{
    int employeeId;
    String employeeName;
    double basicSalary;
    double netSalary;
    //parameterised constructor
    Employee(int id,String n,double s){
	employeeId=id;
	employeeName=n;
	basicSalary=s;
    }
    //method to calculate net salary
    void calculateNetSalary(){
	netSalary=basicSalary+(0.1*basicSalary)+(0.2*basicSalary);
    }
    //method to display the employee details
     void displayEmployeeDetails(){
	System.out.println("EMPLOYEE ID: "+employeeId);
	System.out.println("EMPLOYEE NAME: "+employeeName);
	System.out.println("BASIC SALARY: "+basicSalary);
	System.out.println("NET SALARY: "+netSalary);
    }
}
class EmployeeDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE EMPLOYEE ID: ");
        int id=sc.nextInt();
        sc.nextLine(); 
        System.out.println("ENTER THE EMPLOYEE NAME: ");
        String name=sc.nextLine();
	System.out.println("ENTER THE BASIC SALARY: ");
        double sal=sc.nextDouble();
        Employee e=new Employee(id,name,sal);
	e.calculateNetSalary();
	e.displayEmployeeDetails();
    }
}
