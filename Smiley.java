/**
 * Smiley.java  04/12/2017
 *
 * @author - Eve Juarez and Danny Poellot
 * @author - Period 0
 * @author - Id 212345|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */
import java.awt.*;

public class Smiley extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Smiley (constructor) */
   public Smiley(Graphics inWin)
   {
      super(inWin);
      System.out.println("Smiley()");
      win = getWin();
   } //End Smiley()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      System.out.println("Smiley.draw()");
      
      //draw object using relative coordinates
      //face
      win.setColor(Colors.YELLOW);
      win.fillOval(inX, inY, 100, 100);
      win.setColor(Colors.BLACK);
      win.drawOval(inX, inY, 100, 100);
      
      //eyes
      win.fillOval(inX + 35, inY + 25, 10, 20);
      win.fillOval(inX + 55, inY + 25, 10, 20);
      
      //eyelashes
      win.drawLine(inX + 38, inY + 20, inX + 35, inY + 16);
      win.drawLine(inX + 40, inY + 20, inX + 40, inY + 16);
      win.drawLine(inX + 42, inY + 20, inX + 45, inY + 16);
      
      win.drawLine(inX + 58, inY + 20, inX + 55, inY + 16);
      win.drawLine(inX + 60, inY + 20, inX + 60, inY + 16);
      win.drawLine(inX + 62, inY + 20, inX + 65, inY + 16);
      
      //Mouth
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
   } //End Smiley.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Smiley.drawSad()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End Smiley.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         if (SOPL_MODE)
            System.out.println("Smiley.draw3()");
   } //End Smiley.draw3()
   
   /* Method: animateHorizontalRight2 */
   public void animateHorizontalRight2(int inStartX, int inY, 
                                       int inEndX, int inXSpacing, 
                                       MyCanvas inMyCanvas, int inPause,
                                       int inBackground)       
   {
      if (SOPL_MODE)
         System.out.println("animateHorizontalRight2()");
      
      //for loop
      for (int x = inStartX; x <= inEndX; x = x + inXSpacing)
      {
         inMyCanvas.drawBackground(inBackground);
         draw2(x, inY);
         inMyCanvas.pause(inPause);
      }
   } //End AnimatedGraphic.animateHorizontalRight2()
} //close Smiley Class