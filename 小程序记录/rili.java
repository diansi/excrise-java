import java.time.DayOfWeek;
import java.time.LocalDate;
public class baoli {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		int month=date.getMonthValue();
		int today=date.getDayOfMonth();
		
		date=date.minusDays(today-1);
		DayOfWeek weekday=date.getDayOfWeek();
		int value=weekday.getValue();
		
		System.out.println("mon tue wed thu fri sat sun");
		for(int n=1;n<value;n++)
			System.out.println(" ");
		
		while(date.getMonthValue()==month)
		{
			System.out.printf("%ld",date.getDayOfMonth());
			if(date.getDayOfMonth()==today)
				System.out.print("*");
			else
				System.out.print(" ");
			date=date.plusDays(1);
			if(date.getDayOfMonth()==1)
				System.out.println();
		}
		if(date.getDayOfWeek().getValue()!=1)
			System.out.println();
		

	}

}