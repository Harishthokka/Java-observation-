//java program for hierarical inheritance
class Parent
{
	int a=16;
	int b=7;
}
class Child1 extends Parent
{
	int c=a+b;
	void add()
	{
		System.out.println("add is:"+c);
	}
}
class Child2 extends Parent
{
	int c=a-b;
	void sub()
	{
		System.out.println("sub is:"+c);
	}
}
class Child3 extends Parent
{
	int c=a*b;
	void mul()
	{
		System.out.println("mul is:"+c);
	}
}
class Heirin
{
	public static void main(String[] args)
	{
		Child1 obj1=new Child1();
		Child2 obj2=new Child2();
		Child3 obj3=new Child3();
		obj1.add();
		obj2.sub();
		obj3.mul();
	}
}
