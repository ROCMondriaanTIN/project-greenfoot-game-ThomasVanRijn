
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeScreen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HomeScreen extends World {

    /**
     * Constructor for objects of class HomeScreen.
     *
     */
    public HomeScreen() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        Button button = new Button();
        addObject(button, 500, 650);
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("t")) {
            Greenfoot.setWorld(new TestWorld());

        }

    }
}