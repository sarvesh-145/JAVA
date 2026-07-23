//program to calculate the simple interest
class SimpleInterest{
    public static void main(String args[]){
	int p=Integer.parseInt(args[0]);
	int t=Integer.parseInt(args[1]);
	int r=Integer.parseInt(args[2]);
	System.out.println("Simple Interest="+((p*t*r)/100));
   }
}
