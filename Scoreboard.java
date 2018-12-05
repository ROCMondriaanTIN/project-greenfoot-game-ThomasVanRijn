
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scoreboard extends Mover {

    public boolean keyGreen = false;
    public boolean keyBlue = false;
    public boolean keyRed = false;
    public boolean keyYellow = false;
    public int ster = 1;
    public boolean diamant = false;
    
    private int keyLocation = 50;
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        
    }
    
    public void updateKeyBlue() {
        keyBlue = true;
        getWorld().addObject(new KeyBlueHud(), keyLocation, 750);
        keyLocation += 50;
    }
    public void updateKeyGreen() {
        keyGreen = true;
        getWorld().addObject(new KeyGreenHud(), keyLocation, 750);
        keyLocation += 50;
    }
    public void updateKeyRed() {
        keyRed = true;
        getWorld().addObject(new KeyRedHud(), keyLocation, 750);
        keyLocation += 50;
    }
    public void updateKeyYellow() {
        keyYellow = true;
        getWorld().addObject(new KeyYellowHud(), keyLocation, 750);
        keyLocation += 50;
    }
    
    public void updateDiamant() {
        diamant = true;
        getWorld().addObject(new DiamantHud(), 950, 750);
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
