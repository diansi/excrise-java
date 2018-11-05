package testthis1;

public class testthis1 {
	testthis1(String str){
		System.out.println(str);
	}
	testthis1(){
		this("测试成功！");
	}

	public static void main(String[] args) {
		testthis1 Testthis1=new testthis1();

	}

}

//在构造函数中通过this可以调用同一类别中的构造函数
