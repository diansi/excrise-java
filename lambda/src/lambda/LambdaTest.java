package lambda;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class LambdaTest {
	public static void main(String[] args) {
		String[] planes=new String[] {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
		System.out.println(Arrays.toString(planes));
		System.out.println("Sorted in dictionary order:");
		Arrays.sort(planes);
		System.out.println(Arrays.toString(planes));
		System.out.println("Sorted by length:");
		Arrays.sort(planes,(first,second)->first.length()-second.length());
		System.out.println(Arrays.toString(planes));
		
		Timer t=new Timer(1000,event->System.out.println("This time is "+new Date()));
		t.start();
		
		//keep program running until user selects "Ok"
		JOptionPane.showMessageDialog(null,"Quit program?");
		System.exit(0);
	}

}
