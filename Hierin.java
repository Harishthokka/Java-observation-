//java program for hierarical inheritance
class Parent
{
	int a,b,c;
	a=18;
	b=26;
}
class Child1 extends Parent
{
	c=a+b;
	void add()
	{
		System.out.println("add is:",c);
	}
}
class Child1 extends Parent
{
	c=a-b;
	void add()
	{
		System.out.println("sub is:",c);
	}
}
class Child1 extends Parent
{
	c=a*b;
	void add()
	{
		System.out.println("mul is:",c);
	}
}
class Hierin
{
	public static void main(String[] args)
	{
	
	}
}
