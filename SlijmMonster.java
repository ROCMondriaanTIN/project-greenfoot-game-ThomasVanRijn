
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class SlijmMonster extends Mover {

    private int frame = 1;
    private int animationTimer = 1;
    private int oldX = getX();
    private boolean checkMovement;

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public SlijmMonster() {
        super();
        setImage("slimeRight.png");
//        getImage().mirrorHorizontally();
        walkRange = 140;
        firstAct = true;
        speed = 1;
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }

        checkMovement();
        if (animationTimer % 25 == 0 && checkMovement == false) {
            animateRight();
        }
        if (animationTimer % 25 == 0 && checkMovement == true) {
            animateLeft();
        }
        animationTimer++;
        oldX = getX();

    }

    public void animateRight() {
        if (frame == 1) {
            setLocation(getX(), getY() - 1);
            setImage("slimeRight.png");
        } else if (frame == 2) {
            setLocation(getX(), getY() + 1);
            setImage("slimeRight2.png");
            frame = 1;
            return;
        }

        frame++;
    }

    public void animateLeft() {
        if (frame == 1) {
            setLocation(getX(), getY() - 1);
            setImage("slimeLeft.png");
        } else if (frame == 2) {
            setLocation(getX(), getY() + 1);
            setImage("slimeLeft2.png");
            frame = 1;
            return;
        }

        frame++;
    }

    public void checkMovement() {

        if (oldX > getX()) {
            checkMovement = true;
        } else {
            checkMovement = false;
        }
    }
}
