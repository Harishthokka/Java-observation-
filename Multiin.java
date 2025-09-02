//java program for multilevel inheritence
class Rootparent
{
	void show()
	{
		System.out.println("root parent class method called");
	}
}
class Parent extends Rootparent
{
	void display()
	{
		System.out.println(" parent class method called");
	}
}
class Child extends Parent
{
	void prints()
	{
		System.out.println("child class method called");
	}
}
class Multiin
{
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.show();
		obj.display();
		obj.prints();
	}
}
