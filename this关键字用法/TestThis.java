package testthis;

public class TestThis {
	int x;
	int y;
	static void show(TestThis tc) {
		System.out.println(tc.x+" "+tc.y);
	}
	void showtest() {
		show(this);
	}
	public static void main(String args[]) {
		TestThis p=new TestThis();
		p.x=9;
		p.y=10;
		p.showtest();
		
	}
}

//this传递多个参数