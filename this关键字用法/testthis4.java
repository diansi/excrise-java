package testthis4;

public class testthis {
	int i=0;
	testthis increment() {
		i+=2;
		return this;
	}
	void print() {
		System.out.println("i="+1);
	}
	public static void main() {
		testthis Testthis=new testthis();
		Testthis.increment().increment().print();
	}

}


//����Ҫ���ص�ǰ���������ʱ���ͳ����ڷ���дreturn this