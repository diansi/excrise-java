/*此程序展现的java特性有
 * 重载构造器
 * 用this（...）调用另一个构造器
 * 无参数构造器
 * 对象初始化块
 * 静态初始化块
 * 实例域初始化
 */
import java.util.*;
public class texing {

	public static void main(String[] args) {
		//fill the staff array with three employee objects
		Employee[] staff=new Employee[3];
		
		staff[0]=new Employee("harry",40000);
		staff[1]=new Employee(60000);
		staff[2]=new Employee();
		
		//print out information about all employee objects
		for(Employee e:staff)
		System.out.println("name="+e.getName()+",id="+e.getId()+",Salary="+e.getSalary());

	}

}












