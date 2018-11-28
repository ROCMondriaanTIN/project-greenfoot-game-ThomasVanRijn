
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SterHud here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SterHud extends Ster {
    boolean groot;
    
    public SterHud(boolean groot) {
        this.groot = groot;
    }

    int sterNummer = 1;
    int timer = 1;

    /**
     * Act - do whatever the SterHud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
        setImage("star.png");
        if(groot == true) {
            getImage().scale(getImage().getWidth() + 52, getImage().getHeight() + 52);
        } else {
            getImage().scale(getImage().getWidth() + 30, getImage().getHeight() + 30);
        }
    }
}
