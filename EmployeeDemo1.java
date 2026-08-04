import java.util.Scanner;
abstract class Employee{
    int employeeId;
    String employeeName;
    int BasicSalary;
Employee(int employeeId,String employeeName,int BasicSalary,int DA,int HRA){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.BasicSalary=BasicSalary;
}
public:
    abstract void calculateSalary();
    abstract void Display();
}
class PermanentEmployee extends Employee{
    int DA;
    int HRA;
    int grosssalary;
    PermanentEmployee(int DA,int HRA){
        super();
        this.DA=DA;
        this.HRA=HRA;
}
Public: 
    void calculateSalary(){
        grosssalary=BasicSalary+((40/100)*DA)+((20/100)*HRA);
    }
    void Display(){
          System.out.println("----EMPLOYEE DETAILS----\n1.EMPLOYEE ID: "+employeeId+"\n2.EMPLOYEE NAME: "+employeeName+"\n3.BASIC SALARY: "+BasicSalary+"\n4.GROSS SALARY: "+grosssalary);
    }
}
class ContractEmployee extends Employee{
    final int FA=5000;
    int grosssalary;
    ContractEmployee(){
        super();
}
Public: 
    void calculateSalary(){
        grosssalary=BasicSalary+FA;
    }
    void Display(){
          System.out.println("----EMPLOYEE DETAILS----\n1.EMPLOYEE ID: "+employeeId+"\n2.EMPLOYEE NAME: "+employeeName+"\n3.BASIC SALARY: "+BasicSalary+"\n4.GROSS SALARY: "+grosssalary);
    }
}
class EmployeeDemo1{
  Scanner sc=new Scanner(System.in)
    public static void main(String[] args){
        PermanentEmployee p=new PermanentEmployee();
        ContractEmployee c=new ContractEmployee();
        System.out.println("----SELECT AN OPTION: \n\tPERMANENT EMPLOYEE(1)\n\tCONTRACT EMPLOYEE(2)")
        int option;
        switch(option){
          case 1:
            p.calculateSalary();
            p.Display();
            break;
          case 2:
            c.calculateSalary();
            c.Display();
            break;
        }
  }
}


