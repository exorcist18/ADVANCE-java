import javax.swing.*;
import java.awt.*;

public class prac
{
	public static void main(String args[])
	{
		JFrame f1 = new JFrame("welcome");
		JPanel p1 = new JPanel();
		JButton b1 = new JButton("submit");
		f1.setSize(400,400);
		f1.setVisible(true);
		p1.add(b1);
		f1.add(p1);
	}
}
