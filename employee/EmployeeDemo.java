import p1.Employee;
import p2.Parttimeemployee;
public class EmployeeDemo{
    public static void main(String[] args){
        Parttimeemployee pte=new Parttimeemployee("John", 25, 20, 15.5f);
        pte.Calculatepay();
        pte.display();
    }
}