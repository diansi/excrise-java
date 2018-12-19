package enums;
import java.util.*;

public class EnumTest {
	public static void main(String agrs[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a size:(SMALL,MEDIUM,LARCE,EXTRA_LARCE)");
		String input=in.next().toUpperCase();
		Size size=Enum.valueOf(Size.class,input);
		System.out.println("Size="+size);
		System.out.println("abbreviation="+size.getAbbreviation());
		if(size==Size.EXTRA_LARCE)
			System.out.println("Good job--you paid attendtion to the _.");
	}

}
enum Size
{
	SMALL("S"),MEDIUM("M"),LARCE("L"),EXTRA_LARCE("XL");
	private Size(String abbreviation)
	{
		this.abbreviation=abbreviation;
	}
	public String getAbbreviation()
	{
		return abbreviation;
	}
	private String abbreviation;
}
