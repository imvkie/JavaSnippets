package sample_programs.applet;

import java.awt.*;
import java.applet.*;
 
public class applet extends Applet{
       
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void paint(Graphics g)
{
               
         
                g.drawOval(60, 60, 200, 200);
                g.fillOval(90, 120, 50, 20);
                g.fillOval(190, 120, 50, 20);
                g.drawLine(165, 125, 165, 175);
                g.drawArc(110, 130, 95, 95, 0, -180);
        }
}