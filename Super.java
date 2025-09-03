//java program for super keyword
class Parent
{
	Parent()
	{
		System.out.println("parent class called using super keyword");
	}
	int a=12;
	int b=15;
	void show()
	{
		System.out.println("add is:"+(a+b));
	}
}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("child class called using super keyword");
	}
	void display()
	{	
		super.show();
		System.out.println("sub is:"+(a-b));
	}
}
class Super
{
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.display();
	}
}
