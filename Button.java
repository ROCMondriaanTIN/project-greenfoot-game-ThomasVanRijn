
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Button extends Actor {

    String name;

    public Button(String image) {
        setImage(image);
        this.name = image.replaceAll(".png", "");
    }

    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            switch (name) {
                case "ButtonSelect":
                    Greenfoot.setWorld(new ScreenSelect());
                    break;
                case "arrowLeft":
                    Greenfoot.setWorld(new ScreenHome());
                    break;
                case "return":
                    if (getWorld() instanceof Level1) {
                        Greenfoot.setWorld(new Level1());
                    }
                    if (getWorld() instanceof Level2) {
                        Greenfoot.setWorld(new Level2());
                    }
                    if (getWorld() instanceof Level3) {
                        Greenfoot.setWorld(new Level3());
                    }
                    if (getWorld() instanceof Level4) {
                        Greenfoot.setWorld(new Level4());
                    }
                    if (getWorld() instanceof Level1Diamant) {
                        Greenfoot.setWorld(new Level4());
                    }

                    break;
                case "DiamandLevels":
                    Greenfoot.setWorld(new ScreenSelectDiamant());
                    break;
                case "Level1Unlocked":
                    Greenfoot.setWorld(new Level1());
                    break;
                case "Level1Gehaalt":
                    Greenfoot.setWorld(new Level1());
                    break;
                case "Level1Gehaalt+Diamant":
                    Greenfoot.setWorld(new Level1());
                    break;
                case "DiamandLevel1":
                    Greenfoot.setWorld(new Level1Diamant());
                    break;
                case "Level2Unlocked":
                    Greenfoot.setWorld(new Level2());
                    break;
                case "Level2Gehaalt":
                    Greenfoot.setWorld(new Level2());
                    break;
                case "Level3Unlocked":
                    Greenfoot.setWorld(new Level3());
                    break;
                case "Level3Gehaalt":
                    Greenfoot.setWorld(new Level3());
                    break;
                case "Level4Unlocked":
                    Greenfoot.setWorld(new Level4());
                    break;
                case "Level4Gehaalt":
                    Greenfoot.setWorld(new Level4());
                    break;
            }
        }
    }
}
