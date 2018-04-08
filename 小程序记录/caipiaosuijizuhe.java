import java.lang.reflect.Array;
import java.util.*;
public class caipiao{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("How many numbers do you need to draw?");
		int k=in.nextInt();
		System.out.println("What is the highest number you can draw?");
		int n=in.nextInt();
		//fill an arry with numbers 1,2,3,.......,n
		int number[]=new int[n];
		for(int i=0;i<number.length;i++)
			number[i]=i+1;
		//draw k numbers and put them into a second array
		int result[]=new int[k];
		for(int i=0;i<result.length;i++)
		{
			int r=(int)(Math.random()*n);
			result[i]=number[r];
			
			//move the last element into the random location
			number[r]=number[r-1];
			n--;
		}
		//print the sorted array
		Arrays.sort(result);
		System.out.println("Bet the following combination.It'll make you rich!");
		for(int r:result)
			System.out.println(r);
			
		
	}
}
