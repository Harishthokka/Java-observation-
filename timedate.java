import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
class Timedate
{	
	public static void main(String args[])
	{
		LocalDate d=LocalDate.now();
		System.out.println(d);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		DateTimeFormatter ft=DateTimeFormatter.ofPattern("EEE,MMM,dd,yyyy , hh:mm:ss");
		System.out.println(dt.format(ft));
	}
}
