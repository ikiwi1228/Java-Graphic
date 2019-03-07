package Graphics_Unit_1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      
      upperBody(window);
      
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);

      window.setColor(Color.GREEN);
      window.fillOval(350, 130, 20, 20);
      window.fillOval(430, 130, 20, 20);

      window.setColor(Color.BLACK);
      window.fillOval(395,150,10,5);
      window.setColor(Color.RED);
      window.drawArc(360, 150, 75, 30, 0, -180);
		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.BLUE);
       window.fillRect(330, 250, 150, 100);
       window.setColor(Color.BLACK);
       window.drawLine(280, 250, 330, 300);
		//add more code here
       window.drawLine(520, 250, 480, 300);

   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.GRAY);
       window.fillRect(330, 400, 150, 100);

       window.setColor(Color.BLACK);
       window.drawLine(280, 400, 330, 450);
       window.drawLine(530, 400, 480, 450);
       window.drawString("Centipede Robot ", 600, 500);

		//add more code here

   }
}