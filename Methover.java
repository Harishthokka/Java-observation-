class Sum
{
	double a,b,c,d;
	void math()
	{
		a=2;
		b=4;
		c=a+b;
		System.out.println("add of"+c);
	}
	void math(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println("add of"+c);
	}
	void math(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		d=a+b+c;
		System.out.println("add of"+c);
	}
	void math(double x,double y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println("add of"+c);
	}
}
public class Methover
{
	public static void main(String[] args)
	{
		Sum obj=new Sum();
		obj.math();
		obj.math(2,3);
		obj.math(4,5,6);
		obj.math(8.567,9.567);
	}
}
