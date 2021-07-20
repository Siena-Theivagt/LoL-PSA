/**
 * House.java  03/08/2016
 *
 * @author - Eve Juarez and Danny Poellot
 * @author - Period 0
 * @author - Id 212345|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 *
 */

import java.awt.*;

public class House extends AnimatedGraphic
{
   //Globally declare graphics window
	private Graphics win;

	/* Method: House (constructor) */
	public House(Graphics inWin)
	{
      super(inWin);
		System.out.println("House()");
      win = getWin();
	} //End House()

	/* Method: draw */
	public void draw(int inX, int inY)
	{
		System.out.println("House.draw()");

		// Walls
      win.setColor(Colors.BEIGE);
      win.fillRect(inX, inY + 120, 240, 180);
      
		// Roof
		win.setColor(Colors.BROWN);
		int [] xPoints = {inX + 120, inX, inX + 240};
		int [] yPoints = {inY, inY + 120, inY + 120};
		win.fillPolygon(xPoints, yPoints, 3);

		// Door
		win.fillRect(inX + 100, inY + 240, 40, 60);

		// Windows
		win.setColor(Colors.YELLOW);
		win.fillRect(inX + 40, inY + 140, 60, 60);
		win.fillRect(inX + 140, inY + 140, 60, 60);

		// Welcome Mat (call method)
		drawWelcomeMat(inX + 80, inY + 300);
	} //End House.draw()

	/* Method: drawWelcomeMat */
	public void drawWelcomeMat(int inX, int inY)
	{
		System.out.println("House.drawWelcomeMat()");

      // draw object using relative coordinates
		// Outer circle
		win.setColor(Colors.CHOCOLATE);
		win.fillOval(inX, inY, 80, 40);

		// Inner circle
		win.setColor(Colors.BEIGE);
		win.fillOval(inX + 5, inY + 5, 70, 30);

		// "Welcome" text
		win.setFont(new Font("ARIAL", Font.PLAIN, 12));	
		win.setColor(Colors.CHOCOLATE);
		win.drawString("Welcome", inX + 14, inY + 24);
	} //End House.drawWelcomeMat()
   
   /* Method: draw2 */
	public void draw2(int inX, int inY)
	{
      System.out.println("SampleObject.draw2()");
	} //End SampleObject.draw2()
   
   /* Method: draw3 */
	public void draw3(int inX, int inY)
	{
      System.out.println("SampleObject.draw3()");
	} //End SampleObject.draw3()
} //End House class