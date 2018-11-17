
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

    public int groeneMunt;
    public int blauweMunt;
    public int rozeMunt;

    public int jumpHeight = 13;
    public int walkSpeed = 5;

    int frame = 1;
    int animationTimer = 0;
    int animationTimerFrame = 10;
    int kleur = 1;
    int direction = 2;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("alien1_stand2.png");
    }

    @Override
    public void act() {
        changePlayer();

        handleInput();
        getDiamant();
        getGroeneMunt();
        getBlauweMunt();
        getRozeMunt();

        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Vlieg.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
            }
        }
        for (Actor enemy : getIntersectingObjects(SlijmMonster.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
            }
        }
    }

    public int getDiamant() {
        if (isTouching(Diamant.class)) {
            removeTouching(Diamant.class);
            diamant++;
        }
        return diamant;
    }

    public int getGroeneMunt() {
        if (isTouching(GroeneMunt.class)) {
            removeTouching(GroeneMunt.class);
            groeneMunt++;
        }
        return groeneMunt;
    }

    public int getBlauweMunt() {
        if (isTouching(BlauweMunt.class)) {
            removeTouching(BlauweMunt.class);
            blauweMunt++;
        }
        return blauweMunt;
    }

    public int getRozeMunt() {
        if (isTouching(RozeMunt.class)) {
            removeTouching(RozeMunt.class);
            rozeMunt++;
        }
        return rozeMunt;
    }

    public boolean onGround() {
        Actor under = getOneObjectAtOffset(0, getHeight() / 2, Tile.class);
        Tile tile = (Tile) under;
        return tile != null && tile.isSolid == true;
    }

    public void handleInput() {
        if(onGround() == false) setImage("alien"+kleur+"_jump"+direction+".png");
        if (keyUp() && onGround() == true) {
            velocityY = -jumpHeight;
            
        }

        if (keyLeft()) {
            velocityX = -walkSpeed;
            
            if (animationTimer % animationTimerFrame == 0 && onGround()) {
                animateLeft();
            }
            animationTimer++;
            direction = 1;
        }

        if (keyRight()) {
            velocityX = walkSpeed;
            
            if (animationTimer % animationTimerFrame == 0 && onGround()) {
                animateRight();
            }
            animationTimer++;
            direction = 2;
        }
        if(keyUp() == false && keyLeft() == false && keyRight() == false
                && onGround() == true) {
            setImage("alien"+kleur+"_stand"+direction+".png");
        }
    }

    public void changePlayer() {
        if (groeneMunt == 1) {
            setImage("alien1_stand"+direction+".png");
            groeneMunt = 0;
            jumpHeight = 14;
            walkSpeed = 5;
            kleur = 1;
            animationTimerFrame = 10;
        } else if (rozeMunt == 1) {
            setImage("alien2_stand"+direction+".png");
            rozeMunt = 0;
            jumpHeight = 11;
            walkSpeed = 3;
            kleur = 2;
            animationTimerFrame = 13;
        } else if (blauweMunt == 1) {
            setImage("alien3_stand"+direction+".png");
            blauweMunt = 0;
            jumpHeight = 17;
            walkSpeed = 5;
            kleur = 3;
            animationTimerFrame = 10;
        }
    }

    public void animateRight() {
        if (frame == 1) {
            setImage("alien" + kleur + "_walkRight1.png");
        } else if (frame == 2) {
            setImage("alien" + kleur + "_walkRight2.png");
            frame = 1;
            return;
        }

        frame++;
    }

    public void animateLeft() {
        if (frame == 1) {
            setImage("alien" + kleur + "_walkLeft1.png");
        } else if (frame == 2) {
            setImage("alien" + kleur + "_walkLeft2.png");
            frame = 1;
            return;
        }

        frame++;
    }

    public int getWidth() {
        return getImage().getWidth();
    }
    public int getHeight() {
        return getImage().getHeight();
    }
    
    public boolean keyUp() {
        boolean keyUp = Greenfoot.isKeyDown("up");
        return keyUp;
    }
    public boolean keyLeft() {
        boolean keyRight = Greenfoot.isKeyDown("left");
        return keyRight;
    }
    public boolean keyRight() {
        boolean keyRight = Greenfoot.isKeyDown("right");
        return keyRight;
    }
}
