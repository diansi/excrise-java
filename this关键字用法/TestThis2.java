package testthis2;
class demo{
	String str="这是成员变量";
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
	Demo.fun("这是局部变量");
	}
}

//当局部变量和成员变量名字重复时，用this将成员变量区分
