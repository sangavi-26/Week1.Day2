package week1.day2;

public class Calculator {
	public void add(int num1, int num2, int num3)
	{
		int sum =num1+num2+num3;
		System.out.println(sum);
	}
	public void sub(int num1, int num2)
	{
		int minus=num2-num1;
		System.out.println(minus);
	}
	public void multiply(double num1, double num2)
	{
		double mult=num1*num2;
		System.out.println(mult);
	}
	public void divide(float num1, float num2)
	{
		float division=num1/num2;
		System.out.println(division);
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add(10, 20, 30);
		obj.sub(45, 35);
		obj.multiply(31.2, 62.1);
		obj.divide(43.2f, 78.2f);
		
		
	}

}
