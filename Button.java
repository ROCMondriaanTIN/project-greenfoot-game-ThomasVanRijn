
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
                case "ButtonStart":
                    switch (Hero.level) {
                        case 1:
                            Greenfoot.setWorld(new Level1());
                            break;
                        case 2:
                            Greenfoot.setWorld(new Level2());
                            break;
                    }
                    break;
                case "ButtonSelect":
                    Greenfoot.setWorld(new ScreenSelect());
                    break;
                case "arrowLeft":
                    Greenfoot.setWorld(new ScreenHome());
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
            }
        }

    }
}
