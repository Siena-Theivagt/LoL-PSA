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

public class Title extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   private final int SHORT_PAUSE = 1000;
   //Globally declare graphics window
   private Graphics win;
   private int inX;
   private int inY;
   
	/* Method: Title (constructor) */
   public Title(Graphics inWin, int x, int y)
   {
      super(inWin);
      System.out.println("Title()");
      win = getWin();
   } //End Title()100
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Title.draw()");
      //draw object using relative coordinatesin
      //Draw title
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.BOLD, 60));
      win.drawString("Save the Earth", inX, inY);
      //Pause for readers
      pause(SHORT_PAUSE);  
      win.drawString("One meal at a time", inX - 45, inY + 100);
      pause(SHORT_PAUSE);
      //Pause for readers
      pause(SHORT_PAUSE);
      win.setColor(Colors.CHARCOAL);
      win.setFont(new Font("BERLIN", Font.PLAIN, 30));      
      win.drawString("By Siena Theivagt", inX + 210, inY + 160);
      pause(SHORT_PAUSE); 
   } //End Title.draw()
   
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Title.draw2()");
      draw(inX, inY);
   } //End Title.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Title.draw3()");
   } //End Title.draw3()
   
   public void pause(double n)
   {
      long startDelay = System.currentTimeMillis();
      long endDelay = 0;
      while (endDelay - startDelay < n)
      {
         endDelay = System.currentTimeMillis();
      }
   } //End MyCanvas.pause()   
} //close Title Class