package Graphics_Unit_2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.awt.Color;
import java.awt.Graphics;

public class Shape {

    //instance variables

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;
    private int xSpeed;
    private int ySpeed;

    public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
        xPos = x;
        yPos = y;
        width = wid;
        height = ht;
        color = col;
        xSpeed = xSpd;
        ySpeed = ySpd;
    }

    /*
     *The draw method draws the shape on the screen.
     */
    public void draw(Graphics window) {
        window.setColor(getColor());
        window.fillRect(xPos, getyPos(), getWidth(), getHeight());

      //draw whatever you want
        //    ^
        //  [ :: ]
        //    ()
    }

    /*
     *This draw method will be used to erase the shape.
     */
    public void draw(Graphics window, Color col) {
        window.setColor(col);
        window.fillRect(xPos, getyPos(), getWidth(), getHeight());
    }

    public void moveAndDraw(Graphics window) {
        //not needed yet
    }

    //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
    public int getX() {
        return xPos;
    }

    public void setX(int x) {
        xPos = x;
    }

    public String toString() {
        return xPos + " " + getyPos() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getxSpeed() + " " + getySpeed();
    }

    /**
     * @return the yPos
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * @param yPos the yPos to set
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the xSpeed
     */
    public int getxSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public int getySpeed() {
        return ySpeed;
    }

    /**
     * @param ySpeed the ySpeed to set
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}
