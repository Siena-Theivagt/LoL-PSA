/**
 * Title.java  05/8/2021
 *
 * @author - Eve Juarez and Danny Poello and Siena Theivagt
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one
 *
 */
import java.awt.*;

public class Money extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Money (constructor) */
   public Money(Graphics inWin)
   {
      super(inWin);
      System.out.println("SampleObject()");
      win = getWin();
   } //End Money()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Money.draw()");
      
      //draw object using relative coordinates
      //face
      
      win.setColor(Colors.GREEN);
      win.fillRect(inX + 0, inY + 0, 300, 140);
      win.fillRect(inX + 20, inY + 20, 260, 100);
      win.fillOval(inX, inY, 100, 100);
      win.setColor(Colors.BLACK);
      win.drawOval(inX, inY, 100, 100);
   } //End Money.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Money.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End Money.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Money.draw3()");
   } //End Money.draw3()
} //close SampleObject Class