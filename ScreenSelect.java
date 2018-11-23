
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
        addObject(new Button("arrowLeft.png"), 67, 60);
        
        addObject(new Button("LevelLock.png"), 230, 234);
        addObject(new Button("LevelLock.png"), 410, 234);
        addObject(new Button("LevelLock.png"), 590, 234);
        addObject(new Button("LevelLock.png"), 770, 234);

        addObject(new Button("LevelLock.png"), 230, 400);
        addObject(new Button("LevelLock.png"), 410, 400);
        addObject(new Button("LevelLock.png"), 590, 400);
        addObject(new Button("LevelLock.png"), 770, 400);

        addObject(new Button("LevelLock.png"), 230, 566);
        addObject(new Button("LevelLock.png"), 410, 566);
        addObject(new Button("LevelLock.png"), 590, 566);
        addObject(new Button("LevelLock.png"), 770, 566);
        
        if (Hero.level == 1) {
            addObject(new Button("Level1Unlock.png"), 230, 234);
        } else if (Hero.level == 2) {
            addObject(new Button("Level1Gehaalt.png"), 239, 239);
            addObject(new Button("Level2Unlock.png"), 410, 234);
        }

    }
}
