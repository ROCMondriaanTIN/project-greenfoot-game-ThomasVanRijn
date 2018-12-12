
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
            if (Hero.level1Diamant) {
                addObject(new Button("Level1Gehaalt+Diamant.png"), 230, 400);
                addObject(new Button("Level2Unlocked.png"), 410, 400);
            } else {
                addObject(new Button("Level1Gehaalt.png"), 230, 400);
                addObject(new Button("Level2Unlocked.png"), 410, 400);
            }
        }
        if (Hero.level2Gehaald && Hero.level2Sterren >= 2) { 
                addObject(new Button("Level2Gehaalt.png"), 410, 400);
                addObject(new Button("Level3Unlocked.png"), 590, 400);
        }
        if (Hero.level3Gehaald && Hero.level3Sterren >= 2) { 
                addObject(new Button("Level3Gehaalt.png"), 590, 400);
                addObject(new Button("Level4Unlocked.png"), 770, 400);
        }
        if (Hero.level4Gehaald && Hero.level4Sterren >= 2) { 
                addObject(new Button("Level4Gehaalt.png"), 770, 400);
        }

    }
}
