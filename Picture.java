/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Circle body1;
    private Circle body2;
    private Circle body3;
    private Square eye1;
    private Square eye2;
    private Triangle nose;
    private Triangle mouth;
    private Person arm1;
    private Person arm2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        body1 = new Circle();
        body2 = new Circle();
        body3 = new Circle();
        eye1 = new Square();
        eye2 = new Square();
        nose = new Triangle();
        mouth = new Triangle();
        arm1 = new Person();
        arm2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            body1.moveVertical(75);
            body1.changeSize(100);
            body1.changeColor("yellow");
            body1.makeVisible();
            
            body2.changeSize(80);
            body2.changeColor("yellow");
            body2.makeVisible();
            
            body3.moveVertical(-55);
            body3.changeSize(60);
            body3.changeColor("yellow");
            body3.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        
    }
}
