
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public static Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
                tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 1:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 2:
                tile = new Tile("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 3:
                tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 4:
                tile = new Tile("fence.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 5:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 6:
                tile = new Tile("grassCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 7:
                tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 8:
                tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 9:
                tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 10:
                tile = new Tile("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 11:
                tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 12:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 13:
                tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 15:
                tile = new Tile("keyBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 16:
                tile = new Tile("star.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 17:
                tile = new Tile("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 18:
                tile = new Tile("cloud1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 19:
                tile = new Tile("rock.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 20:
                tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 21:
                tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 22:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 23:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 24:
                tile = new Tile("bridgeLogsFliped.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 25:
                tile = new Tile("bush.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 26:
                tile = new Tile("plant.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 27:
                tile = new Tile("stoneCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
