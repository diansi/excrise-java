package testthis2;
class demo{
	String str="���ǳ�Ա����";
	void fun(String str) {
		System.out.println(str);
		System.out.println(this.str);
		this.str=str;
		System.out.println(str);
	}
}
public class TestThis2 {
	public static void main(String args[]) {
	demo Demo=new demo();
	Demo.fun("���Ǿֲ�����");
	}
}

//���ֲ������ͳ�Ա���������ظ�ʱ����this����Ա��������
