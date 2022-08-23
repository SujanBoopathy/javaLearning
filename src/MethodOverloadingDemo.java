class Demo{
	int num1,num2,result;
	
	public void add(int n1,int n2) {
		result=n1+n2;
	}
	public void add(int n1,double n2) {
		result=n1+(int) n2;
	}
	public void add(double n1,double n2) {
		result=(int )n1+(int )n2;
	}
	
}
public class MethodOverloadingDemo {
	public static void main(String args[]) {
		Demo obj=new Demo();
		obj.add(90.9, 10.9);
		System.out.println(obj.result);
	}
}
