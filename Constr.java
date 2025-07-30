class Print
{
	int a,b,c,d;
	Print()
	{
		System.out.println("constructor called");
	}
	void add2(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println("add of"+c);
	}
	void add3(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		d=a+b+c;
		System.out.println("add of"+c);
	}
}
public class Constr
{
	public static void main(String[] args)
	{
		Print obj=new Print();
		obj.add2(8,9);
		obj.add3(2,3,4);
	}
}
