/**
 * AnimatedGraphic.java  05/28/2019
 *
 * @author - Eve Juarez and Danny Poellot
 * @author - Period 0
 * @author - Id 212345|Ursuline Academy of Dallas
 *
 * @author - Honorbound: I received help from no one.
 *
 */
import java.awt.*;

abstract class AnimatedGraphic
{
   // SOPL mode for tracing
   private final boolean SOPL_MODE = true;
   
   //Globally declare graphics window
   private Graphics win;
	
	/* Method: AnimatedGraphic (constructor) */
   public AnimatedGraphic(Graphics inWin)
   {
      win = inWin;
   } //End AnimatedGraphic()
   
   public boolean getSopl()
   {
      return SOPL_MODE;
   }
   
   /* Method: getWin */   
   public Graphics getWin() 
   { 
      return win; 
   } //End AnimatedGraphic.getWin()
	
	/* Abstract Methods: draw, draw2, draw3 */
   public abstract void draw(int inX, int inY);
   public abstract void draw2(int inX, int inY);
   public abstract void draw3(int inX, int inY);
      
   /*******************************/
   /******* Stamping methods *******/
   /*******************************/
   
   /* Method: stampHorizontalRight */
   public void stampHorizontalRight(int inStartX, int inY, 
                                   int inEndX, int inSpacingX)       
   {
      if (SOPL_MODE)
         System.out.println("stampHorizontalRight()");
      
      //for loop
      for (int x = inStartX; x <= inEndX; x = x + inSpacingX)
      {
         draw(x, inY);
      }
   } //End AnimatedGraphic.stampHorizontalRight()
   
   /* Method: stampHorizontalLeft */
   public void stampHorizontalLeft(int inStartX, int inY, 
                                   int inEndX, int inSpacingX)       
   {
      if (SOPL_MODE)
         System.out.println("stampHorizontalLeft()");
      
      //for loop      
      for (int x = inStartX; x >= inEndX; x = x - inSpacingX)
      {
         draw(x, inY);
      }
   } //End AnimatedGraphic.stampHorizontalLeft()
   
   /* Method: stampVerticalDown */
   public void stampVerticalDown(int inX, int inStartY, 
                                int inEndY, int inSpacingY)       
   {
      if (SOPL_MODE)
         System.out.println("stampVerticalDown()");
      
      //for loop
      for (int y = inStartY; y <= inEndY; y = y + inSpacingY)
      {
         draw(inX, y);
      }
   } //End AnimatedGraphic.stampVerticalDown()
   
   /* Method: stampVerticalUp */
   public void stampVerticalUp(int inX, int inStartY, 
                              int inEndY, int inSpacingY)       
   {
      if (SOPL_MODE)
         System.out.println("stampVerticalUp()");
      
      //for loop
      for (int y = inStartY; y >= inEndY; y = y - inSpacingY)
      {
         draw(inX, y);
      }
   } //End AnimatedGraphic.stampVerticalUp()
       
   /* Method: stampDiagonalRightDown */
   public void stampDiagonalRightDown(int inStartX, int inStartY, 
                                       int inEndX, int inEndY, 
                                       int inSpacingX, int inSpacingY)
   {
      if (SOPL_MODE)
         System.out.println("stampDiagonalRightDown()");
      
      //for loop
      for (int x = inStartX, y = inStartY; x <= inEndX && y <= inEndY; 
         x = x + inSpacingX, y = y + inSpacingY)
      {
         draw(x, y);
      }
   } //End AnimatedGraphic.stampDiagonalRightDown()
   
   /* Method: stampDiagonalLeftUp */
   public void stampDiagonalLeftUp(int inStartX, int inStartY, 
                                  int inEndX, int inEndY, 
                                  int inSpacingX, int inSpacingY)
   {
      if (SOPL_MODE)
         System.out.println("stampDiagonalLeftUp()");
      
      //for loop
      for (int x = inStartX, y = inStartY; x >= inEndX && y >= inEndY; 
         x = x - inSpacingX, y = y - inSpacingY)
      {
         draw(x, y);
      }
   } //End AnimatedGraphic.stampDiagonalLeftUp()
   
   /* Method: stampDiagonalLeftDown */
   public void stampDiagonalLeftDown(int inStartX, int inStartY, 
                                    int inEndX, int inEndY, 
                                    int inSpacingX, int inSpacingY)
   {
      if (SOPL_MODE)
         System.out.println("stampDiagonalLeftDown()");
      
      //for loop
      for (int x = inStartX, y = inStartY; x >= inEndX && y <= inEndY; 
         x = x - inSpacingX, y = y + inSpacingY)
      {
         draw(x, y);
      }
   } //End AnimatedGraphic.stampDiagonalLeftDown()
   
   /* Method: stampDiagonalRightUp */
   public void stampDiagonalRightUp(int inStartX, int inStartY, 
                                  int inEndX, int inEndY, 
                                  int inSpacingX, int inSpacingY)
   {
      if (SOPL_MODE)
         System.out.println("stampDiagonalRightUp()");
      
      //for loop
      for (int x = inStartX, y = inStartY; x <= inEndX && y >= inEndY; 
         x = x + inSpacingX, y = y - inSpacingY)
      {
         draw(x, y);
      }
   } //End AnimatedGraphic.stampDiagonalRightUp()
   
   /*******************************/
   /****** Animation methods ******/
   /*******************************/

   /* Method: animateHorizontalRight */
   public void animateHorizontalRight(int inStartX, int inY, 
                                       int inEndX, int inSpacingX, 
                                       MyCanvas inMyCanvas, int inPause,
                                       int inBackground)       
   {
      if (SOPL_MODE)
         System.out.println("animateHorizontalRight()");
      
      //for loop
      for (int x = inStartX; x <= inEndX; x = x + inSpacingX)
      {
         inMyCanvas.drawBackground(inBackground);
         draw(x, inY);
         inMyCanvas.pause(inPause);
      }
   } //End AnimatedGraphic.animateHorizontalRight()
   
   /* Method: animateHorizontalLeft */
   public void animateHorizontalLeft(int inStartX, int inY, 
                                       int inEndX, int inSpacingX, 
                                       MyCanvas inMyCanvas, int inPause,
                                       int inBackground)       
   {
      if (SOPL_MODE)
         System.out.println("animateHorizontalLeft()");
      
      //for loop
      for (int x = inStartX; x >= inEndX; x = x - inSpacingX)
      {
         inMyCanvas.drawBackground(inBackground);
         draw(x, inY);
         inMyCanvas.pause(inPause);
      }
   } //End AnimatedGraphic.animateHorizontalLeft()

	/* Method: animateVerticalDown */
   public void animateVerticalDown(int inX, int inStartY, 
                                    int inEndY, int inSpacingY, 
                                    MyCanvas inMyCanvas, int inPause, 
                                    int inBackground)
   {
      if (SOPL_MODE)
         System.out.println("animateVerticalDown()");
      
      //for loop
      for (int y = inStartY; y <= inEndY; y = y + inSpacingY)
      {
         inMyCanvas.drawBackground(inBackground);
         draw(inX, y);
         inMyCanvas.pause(inPause);
      }
   } //End AnimatedGraphic.animateVerticalDown()
   
   /* Method: animateVerticalUp */
   public void animateVerticalUp(int inX, int inStartY, 
                                 int inEndY, int inSpacingY, 
                                 MyCanvas inMyCanvas, int inPause,
                                 int inBackground)
   {
      if (SOPL_MODE)
         System.out.println("animateVerticalUp()");
      
      //for loop
      for (int y = inStartY; y >= inEndY; y = y - inSpacingY)
      {
         inMyCanvas.drawBackground(inBackground);
         draw(inX, y);
         inMyCanvas.pause(inPause);
      }
   } //End AnimatedGraphic.animateVerticalUp()
   
    
   /* Method: animateDiagonalRightDown */
   public void animateDiagonalRightDown(int inStartX, int inStartY, 
                                          int inEndX, int inEndY, 
                                          int inSpacingX, int inSpacingY, 
                                          MyCanvas inMyCanvas, int inPause,
                                          int inBackground)
   {
      if (SOPL_MODE)
         System.out.println("animateDiagonalRightDown()");
      
      //for loop
      for (int x = inStartX, y = inStartY; x <= inEndX && y <= inEndY; 
         x = x + inSpacingX, y = y + inSpacingY)
      {
         inMyCanvas.drawBackground(inBackground);
         draw(x, y);
         inMyCanvas.pause(inPause);
      }
   } //End AnimatedGraphic.animateDiagonalRightDown()
   
   /* Method: animateDiagonalLeftUp */
   public void animateDiagonalLeftUp(int inStartX, int inStartY, 
                                       int inEndX, int inEndY, 
                                       int inSpacingX, int inSpacingY, 
                                       MyCanvas inMyCanvas, int inPause,
                                       int inBackground)
   {
      if (SOPL_MODE)
         System.out.println("animateDiagonalLeftUp()");
      
      //for loop
      for (int x = inStartX, y = inStartY; x >= inEndX && y >= inEndY; 
         x = x - inSpacingX, y = y - inSpacingY)
      {
         inMyCanvas.drawBackground(inBackground);
         draw(x, y);
         inMyCanvas.pause(inPause);
      }
   } //End AnimatedGraphic.animateDiagonalLeftUp()
   
   /* Method: animateDiagonalLeftDown */
   public void animateDiagonalLeftDown(int inStartX, int inStartY, 
                                          int inEndX, int inEndY, 
                                          int inSpacingX, int inSpacingY, 
                                          MyCanvas inMyCanvas, int inPause,
                                          int inBackground)
   {
      if (SOPL_MODE)
         System.out.println("animateDiagonalLeftDown()");
      
      //for loop
      for (int x = inStartX, y = inStartY; x >= inEndX && y <= inEndY; 
         x = x - inSpacingX, y = y + inSpacingY)
      {
         inMyCanvas.drawBackground(inBackground);
         draw(x, y);
         inMyCanvas.pause(inPause);
      }
   } //End AnimatedGraphic.animateDiagonalLeftDown()
   
     /* Method: animateDiagonalRightUp */
   public void animateDiagonalRightUp(int inStartX, int inStartY, 
                                       int inEndX, int inEndY, 
                                       int inSpacingX, int inSpacingY, 
                                       MyCanvas inMyCanvas, int inPause,
                                       int inBackground)
   {
      if (SOPL_MODE)
         System.out.println("animateDiagonalRightUp()");
      
      //for loop
      for (int x = inStartX, y = inStartY; x <= inEndX && y >= inEndY; 
         x = x + inSpacingX, y = y - inSpacingY)
      {
         inMyCanvas.drawBackground(inBackground);
         draw(x, y);
         inMyCanvas.pause(inPause);
      }
   } //End AnimatedGraphic.animateDiagonalRightUp()
} //close AnimatedGraphic Class