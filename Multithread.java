class Message implements Runnable 
{
	private String msg;
	private int interval;
	Message(String msg,int interval)
	{
		this.msg=msg;
		this.interval=interval;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(msg);
				Thread.sleep(interval*1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(msg+"Thread interrupted");
		}
	}
}
public class Multithread
{
	public static void main(String args[])
	{
		Message obj=new Message("Good morning",1);
		Message obj1=new Message("Hello",2);
		Message obj2=new Message("Welcome",3);
		new Thread(obj).start();
		new Thread(obj1).start();
		new Thread(obj2).start();
	}
}

