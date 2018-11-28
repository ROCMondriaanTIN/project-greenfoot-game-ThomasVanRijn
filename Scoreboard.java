
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scoreboard extends Mover {

    public boolean keyGreen = false;
    public int ster = 1;

    /**
     * Act - do whatever the Scoreboard wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    }

    public void updateKeyGreen() {
        keyGreen = true;
        getWorld().addObject(new KeyGreenHud(), 100, 100);

    }

    public void updateSter() {
        switch (ster) {
            case 1:
                ster++;
                getWorld().addObject(new SterHud(false), 414, 38);
                break;
            case 2:
                ster++;
                getWorld().addObject(new SterHud(false), 586, 38);
                break;
            case 3:
                ster++;
                getWorld().addObject(new SterHud(true), 500, 50);
                break;
            default:
                ster = 0;
        }

    }

}
