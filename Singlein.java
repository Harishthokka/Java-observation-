//java program for singleinheritence
class Parent
{
	int a,b,c;
	void add(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("add is:"+c);
	}
}
class Singlein
{
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.add(5,6);
		obj.display();
	}
}
