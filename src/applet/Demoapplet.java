package applet;

import java.applet.Applet;
import java.awt.Graphics;

/* my first class */
public class Demoapplet extends Applet{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public String s;
		public void init()
		{
			s = new String("Hello World!");
		}
		public void paint(Graphics g)
		{
			g.drawString(s, 1000, 1000);
		}
}
