package testthis3;
class Person{
	public void eat(Apple apple) {
		Apple peeled=apple.getpeeled();
		System.out.println("Yammy!");
	}
	
}
class peeler{
	static Apple peel(Apple apple) {
		return apple;
	}
}
class Apple{
	Apple getpeeled() {
		return peeler.peel(this);  //return peeler.peel(Apple apple);
	}
}
public class testthis {
	public static void main(String args[]) {
		new Person().eat(new Apple());
	}

}

//把当前对象传递给其他方法