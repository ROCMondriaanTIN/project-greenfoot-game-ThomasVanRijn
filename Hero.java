
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    //TileEngine te = new TileEngine();
    
    private final double gravity;
    private final double acc;
    private final double drag;
    private int diamant;
    private int ster;
    
    public static int level = 1;

    public boolean keyBlue = false;
    public boolean keyGreen = false;
    public boolean keyRed = false;
    public boolean keyYellow = false;

    public int groeneMunt;
    public int blauweMunt;
    public int rozeMunt;

    public int blauweSleutel;

    public int jumpHeight = 14;
    public int walkSpeed = 5;

    int frame = 1;
    int animationTimer = 0;
    int animationTimerFrame = 10;
    int kleur = 1;
    int direction = 2;
    
    Scoreboard sb;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("alien1_stand2.png");
    }
    
    @Override
    public void act() {
        touchingWater();
        
        changePlayer();
        handleInput();

        getKeyBlue();
        touchingDoor();
        getKeyGreen();
        touchingGreenLock();

        getDiamant();
        getSter();

        getGroeneMunt();
        getBlauweMunt();
        getRozeMunt();

        getBlauweSleutel();
        
        if(sb == null) {
            sb = new Scoreboard();
            getWorld().addObject(sb, -10, -10);
        }

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
    //Hier kijk ik of de hero het water aanraakt, zo ja dan reset het level.
    public void touchingWater() {
        if(isTouching(WaterTile.class)) {
            Greenfoot.setWorld(new Level1());
        }
    }

    public boolean getKeyBlue() {
        if (isTouching(KeyBlue.class)) {
            removeTouching(KeyBlue.class);
            keyBlue = true;
            sb.updateKeyBlue();
        }
        return keyBlue;
    }

    public void touchingDoor() {
        if (isTouching(Door.class) && keyBlue) {
            level ++;
            Greenfoot.setWorld(new ScreenSelect());
        }
    }

    public boolean getKeyGreen() {
        if (isTouching(KeyGreen.class)) {
            removeTouching(KeyGreen.class);
            sb.updateKeyGreen();
            keyGreen = true;
        }
        return keyGreen;
    }
    
    public void touchingGreenLock() {
        Actor a = this.getOneIntersectingObject(LockGreen.class);
            if(a != null && keyGreen){
                Tile lockGreen = (Tile)a;
                TestWorld testWorld = (TestWorld)getWorld();
                testWorld.te.removeTile(lockGreen);
                
            }
        
        
        
    }

    public int getDiamant() {
        if (isTouching(Diamant.class)) {
            removeTouching(Diamant.class);
            diamant++;
            sb.updateDiamant();
        }
        return diamant;
    }

    public void getSter() {
        if (isTouching(Ster.class)) {
            removeTouching(Ster.class);
            sb.updateSter();
         }
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

    public int getBlauweSleutel() {
        if (isTouching(KeyBlue.class)) {
            removeTouching(KeyBlue.class);
            blauweSleutel++;
        }
        return blauweSleutel;
    }

    public void handleInput() {
        animateJump();
        animateStanding();
        if (keyUp() && velocityY == 0) {
            velocityY = -jumpHeight;
        }
        if (keyLeft() && keyRight() == false) {
            velocityX = -walkSpeed;
            direction = 1;
            if (animationTimer % animationTimerFrame == 0
                    && velocityY == 0) {
                animate();
            }
            animationTimer++;
        }
        if (keyRight() && keyLeft() == false) {
            velocityX = walkSpeed;
            direction = 2;
            if (animationTimer % animationTimerFrame == 0
                    && velocityY == 0) {
                animate();
            }
            animationTimer++;

        }
    }
    
    public boolean onGround() {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2, Tile.class);
        Tile tile = (Tile) under;
        return tile != null && tile.isSolid == true;
    }

    public void changePlayer() {
        if (groeneMunt == 1) {
            setImage("alien1_stand" + direction + ".png");
            groeneMunt = 0;
            jumpHeight = 14;
            walkSpeed = 5;
            kleur = 1;
            animationTimerFrame = 10;
        } else if (rozeMunt == 1) {
            setImage("alien2_stand" + direction + ".png");
            rozeMunt = 0;
            jumpHeight = 11;
            walkSpeed = 3;
            kleur = 2;
            animationTimerFrame = 13;
        } else if (blauweMunt == 1) {
            setImage("alien3_stand" + direction + ".png");
            blauweMunt = 0;
            jumpHeight = 17;
            walkSpeed = 5;
            kleur = 3;
            animationTimerFrame = 10;
        }
    }

    public void animate() {
        if (frame == 1) {
            setImage("alien" + kleur + "_walk" + direction + "1.png");
        } else if (frame == 2) {
            setImage("alien" + kleur + "_walk" + direction + "2.png");
            frame = 1;
            return;
        }
        frame++;
    }

    public void animateJump() {
        if (velocityY != 0) {
            setImage("alien" + kleur + "_jump" + direction + ".png");
        }
    }

    public void animateStanding() {
        if (!keyUp() && !keyLeft() && !keyRight()
                && velocityY == 0 || keyLeft() && keyRight() && !keyUp()) {
            setImage("alien" + kleur + "_stand" + direction + ".png");
        }
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
