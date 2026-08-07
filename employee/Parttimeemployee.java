package p2;
import p1.Employee;
public class Parttimeemployee extends Employee{
    int hours;
    float rate;
    public Parttimeemployee(String name, int age, int hours, float rate){
        super(name, age);
        this.hours=hours;
        this.rate=rate;
    }
    public void Calculatepay(){
        float pay=hours*rate;
    }
    public void display(){
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("HOURS WORKED: "+hours);
        System.out.println("RATE OF PAY: "+rate);
        System.out.println("TOTAL PAY: "+(hours*rate));
    }
}