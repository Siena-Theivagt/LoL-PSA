/**
 * Credits.java  5/13/2021
 *
 * @author - Eve Juarez and Danny Poellot
 * @author - Period 6
 * @author - Id 222188|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 *
 */
import java.awt.*;

public class Credits extends AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = false;
   
   //Globally declare graphics window
   private Graphics win;
   
	/* Method: Credits (constructor) */
   public Credits(Graphics inWin)
   {
      super(inWin);
      System.out.println("Credits()");
      win = getWin();
   } //End Credits()
	
	/* Method: draw */
   public void draw(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Credits.draw()");
      
      //draw object using relative coordinates
      win.setFont(new Font("OPENSANS", Font.PLAIN, 45));
      win.setColor(Colors.WHITE);
      win.drawString("Credits", inX  + 325, inY + 140);
      win.setFont(new Font("Calibri", Font.PLAIN, 40));
      win.drawString("Designed and programmed by", inX + 140, inY + 200);   
      win.drawString("Siena Theivagt", inX + 270, inY + 260);
      win.setFont(new Font("Calibri", Font.PLAIN, 45));
      win.setColor(Colors.WHITE);
      win.drawString("Sources", inX + 320, inY + 350);
      win.setFont(new Font("Calibri", Font.PLAIN, 35));
      
      win.setFont(new Font("Calibri", Font.BOLD, 30));
      win.drawString("About the Rainforest", inX + 270, inY + 420);
      
      win.setFont(new Font("Calibri", Font.PLAIN, 30));
      win.drawString("www.rain-tree.com/facts.htm", inX + 210, inY + 460);      
      win.drawString("Eat Better, Save Animals", inX + 245, inY + 520);
      win.drawString("https://racingextinction.com", inX + 220, inY + 560);
      win.drawString("Beef Drives 80% of Amazon deforestation", inX + 140, inY + 620);
      win.drawString("https://news.mongabay.com", inX + 220, inY + 660);
      //win.drawString("https://blog.naturessunshine.com/en/what-are-we-eating/", inX + 100, inY + 700);
   } //End Credits.draw()
   /* Method: draw2 */
   public void draw2(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Credits.draw2()");
   
      win.setFont(new Font("Calibri", Font.PLAIN, 45));
      win.setColor(Colors.WHITE);
      win.drawString("Credits", inX  + 330, inY + 200);
      win.setFont(new Font("Calibri", Font.PLAIN, 40));
      win.drawString("Designed and programmed by", inX + 130, inY + 200);   
      win.drawString("Siena Theivagt", inX + 270, inY + 260);
      win.setFont(new Font("Calibri", Font.PLAIN, 45));
      win.setColor(Colors.WHITE);
      win.drawString("Sources", inX + 320, inY + 360);
      win.setFont(new Font("Calibri", Font.PLAIN, 35));
      
      //win.setFont(new Font("OPENSANS", Font.PLAIN, 30));
      win.drawString("https://www.rain-tree.com/facts.htm", inX + 100, inY + 420);      
      win.drawString("https://racingextinction.com/ongoing_", inX + 100, inY + 480);
      win.drawString("actions/eat-better-save-animals/", inX + 100, inY + 520);
      win.drawString("https://environmath.org/2020/09/08/", inX + 100, inY + 660);
      win.drawString("https://blog.naturessunshine.com/en/what-are-we-eating/", inX + 100, inY + 700);
   } //End Credits.draw2()
   
   /* Method: draw3 */
   public void draw3(int inX, int inY)
   {
      if (SOPL_MODE)
         System.out.println("Credits.draw3()");
   } //End Credits.draw3()
} //close Credits Class