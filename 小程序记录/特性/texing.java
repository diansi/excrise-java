/*�˳���չ�ֵ�java������
 * ���ع�����
 * ��this��...��������һ��������
 * �޲���������
 * �����ʼ����
 * ��̬��ʼ����
 * ʵ�����ʼ��
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












