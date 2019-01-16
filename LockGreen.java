import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LockGreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LockGreen extends Tile
{
    public LockGreen(String image, int width, int height) {
        super(image, width, height);
    }
    public void act() 
    {
        if(isTouching(Hero.class) && Hero.keyGreen) {
            setImage("niks.png");
            this.isSolid = false;
        }
    }    
}
