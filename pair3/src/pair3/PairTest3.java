package pair3;

import java.time.LocalDate;

import inheritance.Employee;

public class PairTest3 {
	public static void main(String[] args) {
		Manager ceo=new Manager("Gus Greedy",800000,2003,12,15);
		Mangager cfo=new Manager("Sid Sneaky",600000,2003,12,15);
		Pair<Manager> buddies=new Pair<>(ceo,cfo);
		printBuddies(buddies);
		ceo.setBonus(1000000);
		cfo.setBonus(500000);
		Manager[] managers= {ceo,cfo};
		
		Pair<Employee> result=new Pair<>();
		minmaxBonus(managers,result);
		System.out.println("First:"+result.getFirst().getName()+",Second:"+result.getSecond().getName());
	}
	public static void printBuddies(Pair<?extend Employee> p)
	{
		Employee first=p.getFirst();
		Emplouee second=p.getSecond();
		System.out.println(first.getName()+"and"+second.getName()+"are buddies.");
	}
	public static void minmaxBonus(Manager[] a,Pair<? super Manager> result)
	{
		if(a.length==0) 
			return;
		Manager min=a[0];
		Manager max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min.getBonus()>a[i].getBonus())
				min=a[i];
			if(max.getBonus()<a[i].getBonus())
				max=a[i];
		}
		result.setFirst(min);
		result.setSecond(max);
    }
	public static void maxminBonus(Manager[] a,Pair<? super Manager> result)
	{
		minmaxBonus(a,result);
		PairAlg.swapHelper(result);
	}
		
	
}

class PairAlg
{
	public static boolean hasNulls(Pair<?> p)
	{
		return p.getFirst()==null||p.getSecond()==null;
		T t=p.getFirst();
		p.setFirst(p.getSecond);
		p.setSecond(t);
	}
}
public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name,double salary,int year,int month,int day) 
	{
		this.name=name;
		this.salary=salary;
		hireDay=LocalDate.of(year, month, day);
	}
	public String getname()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	public void raiseSalary(double byPercent)
	{
		double raise=salary*byPercent/100;
		salary+=raise;
	}

}
public class Manager extends Employee {
	private double bonus;

	public Manager(String name,double salary,int year,int month,int day)
	{
		super(name,salary,year,month,day);
		bonus=0;
	}
	public double getSalary()
	{
		double baseSalary=super.getSalary();
		return baseSalary+bonus;
	}
	public void setBonus(double b)
	{
		bonus=b;
	}

}









