
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Key extends Mover {

    private String name;
    private Boolean opgepakt;
    String kleur;
    static int xPosKey = 50;

    static boolean blue = false;
    static boolean green = false;
    static boolean red = false;
    static boolean yellow = false;

    public Key() {
        
    }

    public Key(String image, boolean opgepakt) {
        setImage(image);
        this.name = image.replaceAll(".png", "");
        this.opgepakt = opgepakt;
    }

    /**
     * Act - do whatever the Key wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (!opgepakt) {
            applyVelocity();
        }
        if (isTouching(Hero.class)) {
            switch (name) {
                case "keyBlue":
                    blue = true;
                    getWorld().addObject(new Key("keyBlueHud.png", true), xPosKey, 750);
                    getWorld().removeObject(this);
                    
                    break;
                case "keyGreen":
                    green = true;
                    
                    Key keyGreen = new Key("keyGreenHud.png", true);
                    getWorld().addObject(keyGreen, xPosKey, 750);
                    
                    getWorld().removeObject(this);
                    break;
                case "keyRed":
                    red = true;
                    getWorld().addObject(new Key("keyRedHud.png", true), xPosKey, 750);
                    getWorld().removeObject(this);
                    break;
                case "keyYellow":
                    yellow = true;
                    getWorld().addObject(new Key("keyYellowHud.png", true), xPosKey, 750);
                    getWorld().removeObject(this);
                    break;
            }
            xPosKey += 50;
        }
        
    }
    public void resetKey() {
        xPosKey = 50;
        blue = false;
        green = false;
        red = false;
        yellow = false;
    }
}
