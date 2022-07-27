import java.applet.Applet;
import java.awt.*;
public class prac extends Applet
{
    public void init()
    {
      setSize(800,600);
      setForeground(Color.black);
     }
        public void paint(Graphics g)
         {
           
           g.drawRect(200,200,400,200);
           
           g.drawRect(600,280,20,40);
           g.setColor(Color.green);

           for(int i=200;i<600;i+=1)
           {
                try
                {   
                    Thread.sleep(5);
                    g.fillRect(i, 200, 1, 200);
                }
                catch(Exception ex)
                {
                    System.out.println(ex);

                }
           }
         }
}       
/*<applet code="prac" width=500 height=500>
</applet>
*/
