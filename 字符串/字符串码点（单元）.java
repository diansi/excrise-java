
public class �ַ��� {

	public static void main(String[] args) {
		String greeting="hello";
		
		
		int n=greeting.length();
		System.out.println("���뵥Ԫ�����ǣ�"+n);
		
		
		int cpCount=greeting.codePointCount(0,greeting.length());
		System.out.println("��������ǣ�"+cpCount);
		
		
		char first=greeting.charAt(0);
		char last=greeting.charAt(4);
		System.out.println("λ��0�Ĵ��뵥Ԫ�ǣ�"+first+"\nλ��4�Ĵ��뵥Ԫ�ǣ�"+last);
		
		
		int index=greeting.offsetByCodePoints(0,3);
		int cp=greeting.codePointAt(index);
		System.out.println("��3��λ���ϵ�����ǣ�"+cp);
		

	}

}
