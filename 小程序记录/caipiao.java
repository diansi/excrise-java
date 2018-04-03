/**采用大数值改进后的程序
 * 从n个数字中抽取k个数字使用如下公式：
 * n*(n-1)*(n-2)*......*(n-k+1)/1*2*3*4.....*k
 */
import java.math.*;
import java.util.*;
public class caipiao {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("How number do you need to draw?");
		int k=in.nextInt();
		System.out.println("what is highest number you an draw?");
		int n=in.nextInt();
		
		BigInteger lotteryOdds=BigInteger.valueOf(1);
		for(int i=1;i<=k;i++)
			lotteryOdds=lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
		System.out.println("Your odds are l in "+lotteryOdds+".Good luck!");

	}

}
