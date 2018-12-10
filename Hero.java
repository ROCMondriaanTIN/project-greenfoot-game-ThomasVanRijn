
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

    public static boolean level1Gehaald;
    public static boolean level1DiamantGehaald;
    public static boolean level2Gehaald;

    public static int level1Sterren;

    public static boolean diamant1;
    public static boolean diamant2;

    private int ster;

    public static double world;
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
    public int walkSpeed = 6;

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
        checkLevel();

        touchingWater();

        changePlayer();
        handleInput();

        getKeyBlue();
        touchingDoor();

        getKeyGreen();
        touchingLockGreen();

        getKeyRed();
        touchingLockRed();

        getKeyYellow();
        touchingLockYellow();

        getDiamant();
        getSter();

        getGroeneMunt();
        getBlauweMunt();
        getRozeMunt();

        getBlauweSleutel();

        if (sb == null) {
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
                respawn();
                return;
            }
        }
        for (Actor enemy : getIntersectingObjects(SlijmMonster.class)) {
            if (enemy != null) {
                respawn();
                return;
            }
        }
    }

    public void respawn() {
        if (getWorld() instanceof Level1) {
            Greenfoot.setWorld(new Level1());
        }
        if (getWorld() instanceof Level1Diamant) {
            Greenfoot.setWorld(new Level1());
        }
    }

    public double checkLevel() {
        if (getWorld() instanceof Level1) {
            world = 1;
        }
        if (getWorld() instanceof Level1Diamant) {
            world = 1.5;
        }
        return world;
    }

    //Hier kijk ik of de hero het water aanraakt, zo ja dan reset het level.
    public void touchingWater() {
        if (isTouching(WaterTile.class)) {
            respawn();
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
            if(world == 1) {
                level1Gehaald = true;
            } else if (world == 1.5) {
                level1DiamantGehaald = true;
            } 
            
//            switch (World) {
//                case 1:
//                    level1Gehaald = true;
//                    break;
//                case 1.5:
//                    level1Gehaald = true;
//                    break;
//                case 2:
//                    level2Gehaald = true;
//                    break;
//            }
            level++;
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

    public void touchingLockGreen() {
        Actor a = this.getOneIntersectingObject(LockGreen.class);
        if (a != null && keyGreen) {
            Tile lockGreen = (Tile) a;
            TestWorld Level2 = (TestWorld) getWorld();
            Level2.te.removeTile(lockGreen);
            getWorld().removeObjects(getWorld().getObjects(KeyGreenHud.class));
        }
    }

    public boolean getKeyRed() {
        if (isTouching(KeyRed.class)) {
            removeTouching(KeyRed.class);
            sb.updateKeyRed();
            keyRed = true;
        }
        return keyRed;
    }

    public void touchingLockRed() {
        Actor a = this.getOneIntersectingObject(LockRed.class);
        if (a != null && keyRed) {
            keyRed = false;
            Tile lockRed = (Tile) a;
            TestWorld Level4 = (TestWorld) getWorld();
            Level4.te.removeTile(lockRed);
            getWorld().removeObjects(getWorld().getObjects(KeyRedHud.class));
        }
    }

    public boolean getKeyYellow() {
        if (isTouching(KeyYellow.class)) {
            removeTouching(KeyYellow.class);
            sb.updateKeyYellow();
            keyYellow = true;
        }
        return keyYellow;
    }

    public void touchingLockYellow() {
        Actor a = this.getOneIntersectingObject(LockYellow.class);
        if (a != null && keyYellow) {
            keyRed = false;
            Tile lockYellow = (Tile) a;
            TestWorld Level2 = (TestWorld) getWorld();
            Level2.te.removeTile(lockYellow);
            getWorld().removeObjects(getWorld().getObjects(KeyYellowHud.class));
        }
    }

    public void getDiamant() {
        if (isTouching(Diamant.class)) {

            if (world == 1) {
                diamant1 = true;
            }
            if (world == 2) {
                diamant2 = true;
            }
            removeTouching(Diamant.class);
            sb.updateDiamant();
        }
    }

    public void getSter() {
        if (isTouching(Ster.class)) {
            if (ster < 3) {
                removeTouching(Ster.class);
            }

            if (world == 1) {
                level1Sterren++;
            }
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

        testControls();

        if (Greenfoot.isKeyDown("space")) {
            velocityY = -15;
        }
        if (keyUp() && onGround()) {
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
        Actor underLeft = getOneObjectAtOffset(-getImage().getWidth() / 2, getImage().getHeight() / 2, Tile.class);
        Tile tile1 = (Tile) underLeft;
        Actor underRight = getOneObjectAtOffset(getImage().getWidth() / 2, getImage().getHeight() / 2, Tile.class);
        Tile tile2 = (Tile) underRight;

        return (tile1 != null && tile1.isSolid) || (tile2 != null && tile2.isSolid);
    }

    public void changePlayer() {
        if (groeneMunt == 1) {
            setImage("alien1_stand" + direction + ".png");
            groeneMunt = 0;
            jumpHeight = 14;
            walkSpeed = 6;
            kleur = 1;
            animationTimerFrame = 10;
        } else if (rozeMunt == 1) {
            setImage("alien2_stand" + direction + ".png");
            rozeMunt = 0;
            jumpHeight = 11;
            walkSpeed = 4;
            kleur = 2;
            animationTimerFrame = 13;
        } else if (blauweMunt == 1) {
            setImage("alien3_stand" + direction + ".png");
            blauweMunt = 0;
            jumpHeight = 17;
            walkSpeed = 6;
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

    public void testControls() {
        if (Greenfoot.isKeyDown("w")) {
            velocityY = -15;
        }
        if (Greenfoot.isKeyDown("a")) {
            velocityX = -10;
        }
        if (Greenfoot.isKeyDown("d")) {
            velocityX = 10;
        }
    }
}
