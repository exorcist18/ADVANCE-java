import java.awt.event.*;
import java.applet.*;
import java.awt.*;

public class prac6 extends Applet implements ActionListener
{
	Button bttn;

	public void init()
	{
		bttn=new Button("Click Me");
		bttn.setBounds(90,110,70,60);

		add (bttn);

		bttn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bttn);
	}
}

/*
<applet code="prac6" width="400" height="400">
</applet>
*/