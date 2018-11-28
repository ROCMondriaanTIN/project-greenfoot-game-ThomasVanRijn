
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
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            if ("ButtonStart".equals(name)) {
                if (Hero.level == 1) {
                    Greenfoot.setWorld(new TestWorld());
                }
            }
            if ("ButtonSelect".equals(name)) {
                Greenfoot.setWorld(new ScreenSelect());
            }
            if ("arrowLeft".equals(name)) {
                Greenfoot.setWorld(new ScreenHome());
            }
            if ("Level1Unlock".equals(name)) {
                Greenfoot.setWorld(new TestWorld());
            }
            if ("Level1Gehaalt".equals(name)) {
                Greenfoot.setWorld(new TestWorld());
            }
            if ("Level1Gehaalt".equals(name)) {
                Greenfoot.setWorld(new TestWorld());
            }
        }
    }
}
