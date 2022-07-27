import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class prac5 extends Applet implements MouseMotionListener
{
	int x,y;
		public void init()
		{
			addMouseMotionListener(this);
		}
		public void paint(Graphics g)
		{
			g.drawString("X: "+x+"Y: "+y,10,10);
			g.fillRect(x,y,10,10);
		}
		public void mouseDragged (MouseEvent m)
		{
			x=m.getX();
			y=m.getY();
			repaint();
		}
		public void mouseMoved (MouseEvent m)
		{
			x=m.getX();
			y=m.getY();
			repaint();
		}
}

/*
<applet code="prac5" width="400" height="400">
</applet>
*/