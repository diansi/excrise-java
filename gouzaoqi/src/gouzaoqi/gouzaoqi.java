package gouzaoqi;

import java.util.Random;

//重载构造器
//用this()调用另一个构造器
//无参数构造器
//对象初始化块
//静态初始化块
//实例域初始化
public class gouzaoqi {
	public static void main(String args[]) {
		//fill the staff array with three Employee objects
		Employee[] staff=new Employee[3];
		staff[0]=new Employee("Harry",4000);
		staff[1]=new Employee(6000);
		staff[2]=new Employee();
		
		//print out information about all Employee objectis
		for(Employee e:staff)
			System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
		
	}

}
class Employee
{
	private static int nextId;
	private int id;
	private String name="";//instance field initialization(初始化)
	private double salary;
	
	//static initialization block
	static
	{
		Random generator=new Random();
		//set nextId to a random number between 0 and 9999
		nextId=generator.nextInt(10000);//返回一个0~n-1之间的整数
	}
	//object initialization block
	{
		id=nextId;
		nextId++;
	}
	//three overLoaded constructors
	public Employee(String n,double s)
	{
		name=n;
		salary=s;
	}
	public Employee(double s)
	{
		this("Employee #"+nextId,s);
		//calls the Employee(String,double)constructor(构造器)
	}
	//the default(未履行) constructor
	public Employee()
	{
		//name initialized to ""....see above
		//salary not explicitly set...initialized to 0
		//id initialized in initialization block
	}
	public String getName()
	{
		return name;
		
	}
	public double getSalary()
	{
		return salary;
	}
	public int getId()
	{
		return id;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
