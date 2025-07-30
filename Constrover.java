class Add
{
	int a,b,c,d;
	Add()
	{
		System.out.println("constructor called");
	}
	Add(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println("add of"+c);
	}
}
public class Constrover
{
	public static void main(String[] args)
	{
		Add obj=new Add(2,3);
		Add obj2=new Add();
		obj2=obj;
	}
}
