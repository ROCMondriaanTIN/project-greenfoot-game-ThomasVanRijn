
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeScreen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScreenHome extends World {

    /**
     * Constructor for objects of class HomeScreen.
     *
     */
    public ScreenHome() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        addObject(new Button("ButtonSelect.png"), 654, 555);
        addObject(new Button("ButtonStart.png"), 354, 555);
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("t")) {
            Greenfoot.setWorld(new TestWorld());

        }

    }
}
