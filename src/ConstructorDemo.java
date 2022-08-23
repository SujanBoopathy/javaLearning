class CalcDemo{
	int num1,num2;
	CalcDemo(){
		System.out.println("Hello i'm constructor");
	}
	CalcDemo(int n){
		num1=n;
		num2=n;
	}
	CalcDemo(double d){
		num1=(int) d;
		num2=(int) d;
	}
	CalcDemo(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
}
public class ConstructorDemo {
      public static void main(String args[]) {
    	  CalcDemo obj=new CalcDemo(5.9);
    	  System.out.println(obj.num1);
    	  
    	  CalcDemo obj2=new CalcDemo(43,90);
    	  System.out.println(obj2.num1);
    	  System.out.println(obj2.num2);
      }
}
