import java.util.*;
public class yanglaojin {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("How much money will you contribute every year?");
		double payment=in.nextDouble();
		System.out.println("Interest rate in %:");
		double interestRate=in.nextDouble();
		
		double balance=0;
		int year=0;
		
		String input;
		do
		{

			balance+=payment;
			double interest=balance*interestRate/100;
			balance+=interest;
			System.out.println("���Ϊ��"+balance);
			year++;
			
			System.out.println("Ready to retire");
			input=in.next();
			
		}
		while(input.equals("N"));
		

	}

}