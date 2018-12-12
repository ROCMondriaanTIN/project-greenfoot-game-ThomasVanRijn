
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenSelectDiamant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScreenSelectDiamant extends World {

    /**
     * Constructor for objects of class ScreenSelectDiamant.
     *
     */
    public ScreenSelectDiamant() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.setBackground("bg.png");
        addObject(new Button("arrowLeft.png"), 67, 60);

        if (Hero.level1Diamant) {
            if (Hero.level1DiamantGehaald && Hero.level1DiamantSterren >= 2) {
                addObject(new Button("DiamandLevel1Gehaald.png"), 500, 400);
            } else {
                addObject(new Button("DiamandLevel1.png"), 500, 400);
            }

        } else {
            addObject(new Button("LevelLock.png"), 500, 400);
        }
    }
}
