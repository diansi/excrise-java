
public class 字符串 {

	public static void main(String[] args) {
		String greeting="hello";
		
		
		int n=greeting.length();
		System.out.println("代码单元数量是："+n);
		
		
		int cpCount=greeting.codePointCount(0,greeting.length());
		System.out.println("码点数量是："+cpCount);
		
		
		char first=greeting.charAt(0);
		char last=greeting.charAt(4);
		System.out.println("位置0的代码单元是："+first+"\n位置4的代码单元是："+last);
		
		
		int index=greeting.offsetByCodePoints(0,3);
		int cp=greeting.codePointAt(index);
		System.out.println("第3个位置上的码点是："+cp);
		

	}

}
