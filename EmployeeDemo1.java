import java.util.Scanner;
abstract class Employee{
    int employeeId;
    String employeeName;
    double BasicSalary;
    abstract void calculateSalary();
    abstract void Display();
}
class PermanentEmployee extends Employee{
    double DA;
    double HRA;
    double grosssalary;
    PermanentEmployee(int employeeId,String employeeName,double BasicSalary,double DA,double HRA){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.BasicSalary=BasicSalary;
        this.DA=DA;
        this.HRA=HRA;
}
    void calculateSalary(){
        grosssalary=BasicSalary+((0.40)*DA)+((0.20)*HRA);
    }
    void Display(){
          System.out.println("----EMPLOYEE DETAILS----\n1.EMPLOYEE ID: "+employeeId+"\n2.EMPLOYEE NAME: "+employeeName+"\n3.BASIC SALARY: "+BasicSalary+"\n4.GROSS SALARY: "+grosssalary);
    }
}
class ContractEmployee extends Employee{
    final double FA=5000;
    double grosssalary;
    ContractEmployee(int employeeId,String employeeName,double BasicSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.BasicSalary=BasicSalary;
}
    void calculateSalary(){
        grosssalary=BasicSalary+FA;
    }
    void Display(){
          System.out.println("----EMPLOYEE DETAILS----\n1.EMPLOYEE ID: "+employeeId+"\n2.EMPLOYEE NAME: "+employeeName+"\n3.BASIC SALARY: "+BasicSalary+"\n4.GROSS SALARY: "+grosssalary);
    }
}
class EmployeeDemo1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PermanentEmployee p=new PermanentEmployee(10001,"ARUN",100000,2000,1000);
        ContractEmployee c=new ContractEmployee(10002,"ARTHI",100000);
        System.out.println("----SELECT AN OPTION: \n\tPERMANENT EMPLOYEE(1)\n\tCONTRACT EMPLOYEE(2)");
        int option;
        option=sc.nextInt();
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
