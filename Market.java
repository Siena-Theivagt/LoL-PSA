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

public class Market extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Market (constructor) */
   public Market(Graphics inWin)
   {
      super(inWin);
      System.out.println("Market()");
      win = getWin();
   } //End Market()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Market.draw()");
      
      //draw object using relative coordinates
      win.setColor(Colors.SIENNA);
      win.fillRect(inX, inY, 300, 100);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("ARIAL", Font.BOLD, 35));
      win.drawString("Farmer's Market", inX + 20, inY + 40);
      win.setColor(Colors.SIENNA);
      win.fillRect(inX, inY + 100, 20, 150);
      win.fillRect(inX + 280, inY + 100, 20, 150);
      win.fillRect(inX, inY + 250, 300, 150);
   } //End Market.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Market.draw2()");
   
      draw(inX, inY);
      win.setColor(Colors.YELLOW); //wipe out smile
      win.drawArc(inX + 20, inY + 10, 60, 80, 180, 180);
      win.setColor(Colors.BLACK); // make frown
      win.drawArc(inX + 35, inY + 55, 30, 40, 0, 180);
   } //End Market.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Market.draw3()");
   } //End Market.draw3()
} //close Market Class