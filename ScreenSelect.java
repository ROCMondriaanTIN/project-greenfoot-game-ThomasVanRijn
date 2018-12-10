
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenSelect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScreenSelect extends World {

    /**
     * Constructor for objects of class ScreenSelect.
     *
     */
    public ScreenSelect() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.setBackground("bg.png");
        addObject(new Button("arrowLeft.png"), 67, 60);
        addObject(new Button("DiamandLevels.png"), 900, 75);

        addObject(new Button("Level1Unlocked.png"), 230, 400);
        addObject(new Button("LevelLock.png"), 410, 400);
        addObject(new Button("LevelLock.png"), 590, 400);
        addObject(new Button("LevelLock.png"), 770, 400);

        if (Hero.level1Gehaald && Hero.level1Sterren >= 2) {
            if (Hero.diamant1) {
                addObject(new Button("Level1Gehaalt+Diamant.png"), 230, 400);
                addObject(new Button("Level2Unlocked.png"), 410, 400);
            } else {
                addObject(new Button("Level1Gehaalt.png"), 230, 400);
                addObject(new Button("Level2Unlocked.png"), 410, 400);
            }
        }

    }
}
