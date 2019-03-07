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

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.YELLOW);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLACK);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor( new Color(107, 106, 104));
      window.fillOval( 210, 100, 400, 400 );
      window.setColor(Color.YELLOW);
      window.fillOval(280, 210, 50, 80);
      window.fillOval(485, 210, 50, 80);
      window.setColor( Color.WHITE);
      window.drawArc(330,330 , 160, 95, 0, -180);
      window.setColor(Color.BLACK);
      window.fillOval(383,270 , 60, 60);

		//add more code here


   }
}