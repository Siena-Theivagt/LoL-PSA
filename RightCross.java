/**
 * RightCross.java  04/18/2018
 *
 * @author - Eve Juarez and Danny Poellot
 * @author - Period 0
 * @author - Id 212345|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from ...
 *
 */
import java.awt.*;

public class RightCross extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: RightCross (constructor) */
   public RightCross(Graphics inWin)
   {
      super(inWin);
      System.out.println("RightCross()");
      win = getWin();
   } //End RightCross()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("RightCross.draw()");
      
      //draw object using relative coordinates
      //face
//    win.setColor(Colors.RED);
   } //End RightCross.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("RightCross.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End RightCross.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("RightCross.draw3()");
   } //End RightCross.draw3()
} //close RightCross Class