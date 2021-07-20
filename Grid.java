/**
 * Grid.java  03/06/2016
 *
 * @author - Eve Juarez and Danny Poellot
 * @author - Period 0
 * @author - Id 212345|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 *
 */

import java.awt.*;

public class Grid
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
	private Graphics win;
	
	/* Method: Grid (constructor) */
	public Grid(Graphics inWin)
	{
      System.out.println("Grid()");
		win = inWin;
	} //End Grid()
	
	/* Method: draw */
	public void draw(int inX, int inY, int inWidth, int inHeight)
	{
		if (SOPL_MODE)
         System.out.println("Grid.draw()");
		
		// Draws a grid on the screen
		win.setColor(Colors.GREY);	
			
		// Vertical lines
		for (int i = inX; i <= inX + inWidth; i += 20)
		{
         if ((i % 100) == 0)
         { 
            win.setColor(Colors.RED);		
         }
         else 
         {
            win.setColor(Colors.GREY);		
         }
			win.drawLine(i, inY, i, inY + inHeight);
		}

		// Horizontal lines
      for (int i = inY; i <= inY + inHeight; i += 20)
      {
         if ((i % 100) == 0)
         { 
            win.setColor(Colors.RED);		
         }
         else 
         {
            win.setColor(Colors.GREY);		
         }
         win.drawLine(inX, i, inX + inWidth, i);
		}
	} //End Grid.draw()
} //End Grid class