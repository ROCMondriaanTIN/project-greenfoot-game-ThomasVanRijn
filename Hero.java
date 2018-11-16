
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
    int kleur = 1;
    
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("alien1_stand.png");
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
        if(isTouching(Diamant.class)) {
            removeTouching(Diamant.class);
            diamant ++;
        }
        return diamant;
    }
    public int getGroeneMunt() {
        if(isTouching(GroeneMunt.class)) {
            removeTouching(GroeneMunt.class);
            groeneMunt ++;
        }
        return groeneMunt;
    }
    
    public int getBlauweMunt() {
        if(isTouching(BlauweMunt.class)) {
            removeTouching(BlauweMunt.class);
            blauweMunt ++;
        }
        return blauweMunt;
    }
    
    public int getRozeMunt() {
        if(isTouching(RozeMunt.class)) {
            removeTouching(RozeMunt.class);
            rozeMunt ++;
        }
        return rozeMunt;
    }
    
    public boolean onGround() {
        Actor under = getOneObjectAtOffset(0, getHeight()/2, Tile.class);
        Tile tile = (Tile) under;
        return tile != null && tile.isSolid == true;
    }
    public void handleInput() {
        
        if (Greenfoot.isKeyDown("up") && onGround() == true) {
            velocityY = -jumpHeight;
        }

        if (Greenfoot.isKeyDown("left") ) {
            velocityX = -walkSpeed;
        } 
        if (Greenfoot.isKeyDown("right")) {
            velocityX = walkSpeed;
            
            if (animationTimer % 10 == 0) {
                animateRight();
            }
            animationTimer ++;
            
        }
    }

    public void changePlayer() {
        if(groeneMunt == 1) {
            setImage("alien1_stand.png");
            groeneMunt = 0;
            jumpHeight = 13;
            walkSpeed = 5;
            kleur = 1;
        } else if (rozeMunt == 1) {
            setImage("alien2_stand.png");
            rozeMunt = 0;
            jumpHeight = 10;
            walkSpeed = 3;
            kleur = 2;
        } else if (blauweMunt == 1) {
            setImage("alien3_stand.png");
            blauweMunt = 0;
            jumpHeight = 16;
            walkSpeed = 5;
            kleur = 3;
        }
    }
    
    public void animateRight() {
        if (frame == 1) {
            setImage("alien" +kleur+"_walk1.png");
        } else if (frame == 2) {
            setImage("alien"+kleur+"_walk2.png");
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
}
