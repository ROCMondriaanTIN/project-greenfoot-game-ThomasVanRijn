
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private int diamant;
    
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }
    
    @Override
    public void act() {
        handleInput();
        getDiamant();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        
        for (Actor enemy : getIntersectingObjects(Vlieg.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
    }
    public int getDiamant() {
        if(isTouching(Diamant.class)) {
            removeTouching(Diamant.class);
            diamant ++;
        }
        return diamant;
    }
    public boolean onGround() {
        Actor under = getOneObjectAtOffset(0, getHeight()/2, Tile.class);
        return under != null;
    }
    public void handleInput() {
        
        if (Greenfoot.isKeyDown("up") && onGround() == true) {
            velocityY = -10;
        }

        if (Greenfoot.isKeyDown("left") ) {
            velocityX = -4;
        } 
        if (Greenfoot.isKeyDown("right")) {
            velocityX = 4;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
