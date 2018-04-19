import java.util.Random;

class Employee {
	private static int nextId;
	private int id;
	private String name="";
	private double salary;
	
	
	//static initialization block
	static 
	{
		 Random generator=new Random();
		 nextId=generator.nextInt(1000);
	}
	//object initialization block
	{
		id=nextId;
		nextId++;
	}
	//three overload constructors
	public Employee(String n,double s)
	{
		name=n;
		salary=s;
	}
	public Employee(double s)
	{
		this("Employee #"+nextId,s);
	}
	public Employee()
	{
		//name initialization to ""--see above
		//salary not explicitly set --initialization to 0
		//id initialized in initialzation block
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
