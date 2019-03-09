package innerclass;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer.*;


public class InnerClass {
	public static void main(String args[]) {
		TalkingClock clock=new TalkingClock(1000,true);
		clock.start();
		JOptionPane.showMessageDialog(null, "Quit pogram");
		System.exit(0);
	}

}
