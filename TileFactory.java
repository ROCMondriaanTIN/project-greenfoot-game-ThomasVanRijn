
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
    public Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
                tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 1:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 2:
                tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 3:
                tile = new Tile("boxCoin_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 4:
                tile = new Tile("boxCoinAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 5:
                tile = new Tile("boxCoinAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 6:
                tile = new Tile("boxEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 7:
                tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 8:
                tile = new Tile("boxExplosive_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 9:
                tile = new Tile("boxExplosiveAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 10:
                tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 11:
                tile = new Tile("boxItem_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 12:
                tile = new Tile("boxItemAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 13:
                tile = new Tile("boxItemAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 14:
                tile = new Tile("boxWarning.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 15:
                tile = new Tile("brickWall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 16:
                tile = new Tile("bridge.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 17:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 18:
                tile = new Tile("castle.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 19:
                tile = new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 20:
                tile = new Tile("castleCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 21:
                tile = new Tile("castleCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 22:
                tile = new Tile("castleCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 23:
                tile = new Tile("castleCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 24:
                tile = new Tile("castleCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 25:
                tile = new Tile("castleHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 26:
                tile = new Tile("castleHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 27:
                tile = new Tile("castleHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 28:
                tile = new Tile("castleHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 29:
                tile = new Tile("castleHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 30:
                tile = new Tile("castleHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 31:
                tile = new Tile("castleHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 32:
                tile = new Tile("castleHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 33:
                tile = new Tile("castleLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 34:
                tile = new Tile("castleLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 35:
                tile = new Tile("castleLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 36:
                tile = new Tile("castleMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 37:
                tile = new Tile("castleRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 38:
                tile = new Tile("dirt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 39:
                tile = new Tile("dirtCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 40:
                tile = new Tile("dirtCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 41:
                tile = new Tile("dirtCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 42:
                tile = new Tile("dirtCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 43:
                tile = new Tile("dirtCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 44:
                tile = new Tile("dirtCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 45:
                tile = new Tile("dirtHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 46:
                tile = new Tile("dirtHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 47:
                tile = new Tile("dirtHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 48:
                tile = new Tile("dirtHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 49:
                tile = new Tile("dirtHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 50:
                tile = new Tile("dirtHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 51:
                tile = new Tile("dirtHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 52:
                tile = new Tile("dirtHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 53:
                tile = new Tile("dirtLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 54:
                tile = new Tile("dirtLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 55:
                tile = new Tile("dirtLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 56:
                tile = new Tile("dirtMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 57:
                tile = new Tile("dirtRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 58:
                tile = new Door("door_closedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 59:
                tile = new Tile("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 60:
                tile = new Tile("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 61:
                tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 62:
                tile = new Tile("fence.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 63:
                tile = new Tile("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 64:
                tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 65:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 66:
                tile = new Tile("grassCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 67:
                tile = new Tile("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 68:
                tile = new Tile("grassCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 69:
                tile = new Tile("grassCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 70:
                tile = new Tile("grassCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 71:
                tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 72:
                tile = new Tile("grassHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 73:
                tile = new Tile("grassHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 74:
                tile = new Tile("grassHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 75:
                tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 76:
                tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 77:
                tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 78:
                tile = new Tile("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 79:
                tile = new Tile("grassLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 80:
                tile = new Tile("grassLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 81:
                tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 82:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 83:
                tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 84:
                tile = new Tile("hill_large.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 85:
                tile = new Tile("hill_largeAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 86:
                tile = new Tile("hill_small.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 87:
                tile = new Tile("hill_smallAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 88:
                tile = new Tile("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 89:
                tile = new Tile("ladder_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 90:
                tile = new WaterTile("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 91:
                tile = new Tile("liquidLavaTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 92:
                tile = new Tile("liquidLavaTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 93:
                tile = new WaterTile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 94:
                tile = new Tile("liquidWaterTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 95:
                tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 96:
                tile = new Tile("lock_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 97:
                tile = new LockGreen("lock_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 98:
                tile = new LockRed("lock_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 99:
                tile = new LockYellow("lock_yellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 100:
                tile = new Tile("rockHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 101:
                tile = new Tile("rockHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 102:
                tile = new Tile("ropeAttached.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 103:
                tile = new Tile("ropeHorizontal.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 104:
                tile = new Tile("ropeVertical.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 105:
                tile = new Tile("sand.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 106:
                tile = new Tile("sandCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 107:
                tile = new Tile("sandCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 108:
                tile = new Tile("sandCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 109:
                tile = new Tile("sandCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 110:
                tile = new Tile("sandCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 111:
                tile = new Tile("sandCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 112:
                tile = new Tile("sandHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 113:
                tile = new Tile("sandHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 114:
                tile = new Tile("sandHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 115:
                tile = new Tile("sandHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 116:
                tile = new Tile("sandHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 117:
                tile = new Tile("sandHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 118:
                tile = new Tile("sandHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 119:
                tile = new Tile("sandHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 120:
                tile = new Tile("sandLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 121:
                tile = new Tile("sandLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 122:
                tile = new Tile("sandLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 123:
                tile = new Tile("sandMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 124:
                tile = new Tile("sandRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 125:
                tile = new Tile("sign.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 126:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 127:
                tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 128:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 129:
                tile = new Tile("snow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 130:
                tile = new Tile("snowCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 131:
                tile = new Tile("snowCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 132:
                tile = new Tile("snowCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 133:
                tile = new Tile("snowCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 134:
                tile = new Tile("snowCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 135:
                tile = new Tile("snowCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 136:
                tile = new Tile("snowHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 137:
                tile = new Tile("snowHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 138:
                tile = new Tile("snowHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 139:
                tile = new Tile("snowHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 140:
                tile = new Tile("snowHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 141:
                tile = new Tile("snowHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 142:
                tile = new Tile("snowHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 143:
                tile = new Tile("snowHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 144:
                tile = new Tile("snowLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 145:
                tile = new Tile("snowLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 146:
                tile = new Tile("snowLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 147:
                tile = new Tile("snowMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 148:
                tile = new Tile("snowRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 149:
                tile = new Tile("stone.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 150:
                tile = new Tile("stoneCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 151:
                tile = new Tile("stoneCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 152:
                tile = new Tile("stoneCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 153:
                tile = new Tile("stoneCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 154:
                tile = new Tile("stoneCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 155:
                tile = new Tile("stoneCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 156:
                tile = new Tile("stoneHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 157:
                tile = new Tile("stoneHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 158:
                tile = new Tile("stoneHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 159:
                tile = new Tile("stoneHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 160:
                tile = new Tile("stoneHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 161:
                tile = new Tile("stoneHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 162:
                tile = new Tile("stoneLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 163:
                tile = new Tile("stoneLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 164:
                tile = new Tile("stoneLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 165:
                tile = new Tile("stoneMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 166:
                tile = new Tile("stoneRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 167:
                tile = new Tile("stoneWall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 169:
                tile = new Tile("tochLit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 170:
                tile = new Tile("tochLit2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 171:
                tile = new Tile("torch.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 172:
                tile = new Tile("window.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 173:
                tile = new Tile("dirtCaveUL.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 174:
                tile = new Tile("dirtCaveUR.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 175:
                tile = new Tile("dirtCaveSpikeTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 176:
                tile = new Tile("dirtCaveTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 181:
                tile = new Tile("bush.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 182:
                tile = new Tile("plant.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 183:
                tile = new Tile("rock.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 185:
                tile = new Tile("tree.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 186:
                tile = new Tile("treeBranchesLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 187:
                tile = new Tile("treeBranchesLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 188:
                tile = new Tile("treeBranchesRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 189:
                tile = new Tile("treeBranchesSnowRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 190:
                tile = new Tile("treeTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 191:
                tile = new Tile("treeTrunk.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 192:
                tile = new Tile("cloud3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 193:
                tile = new Tile("metalCenterWarning.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 194:
                tile = new Tile("metalCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 195:
                tile = new Tile("metalCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 196:
                tile = new Tile("metalCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 197:
                tile = new Tile("metalCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 198:
                tile = new Tile("metalHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 199:
                tile = new Tile("metalHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 200:
                tile = new Tile("metalHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 201:
                tile = new Tile("metalHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 202:
                tile = new Tile("metalLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 203:
                tile = new Tile("metalMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 204:
                tile = new Tile("metalRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 205:
                tile = new Tile("metalRounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 206:
                tile = new Tile("metalCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 207:
                tile = new Tile("metalCenterSticker.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 208:
                tile = new Tile("chain.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 209:
                tile = new Tile("metalCenterDark.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 210:
                tile = new Tile("metalCenterStickerDark.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 212:
                tile = new Tile("metalCenterWarningDark.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 213:
                tile = new Tile("tile_21.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 214:
                tile = new Tile("tile_20.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 215:
                tile = new Tile("keyBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 216:
                tile = new Tile("keyGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 217:
                tile = new Tile("keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 218:
                tile = new Tile("keyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 219:
                tile = new Tile("star.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 220:
                tile = new Tile("alienBlue_badge2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 221:
                tile = new Tile("alienGreen_badge2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 222:
                tile = new Tile("alienPink_badge2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 223:
                tile = new Tile("tundraCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 224:
                tile = new Tile("tundraCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 225:
                tile = new Tile("tundraCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 226:
                tile = new Tile("tundraCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 227:
                tile = new Tile("tundraCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 228:
                tile = new Tile("tundraCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 229:
                tile = new Tile("tundraHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 230:
                tile = new Tile("tundraHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 231:
                tile = new Tile("tundraHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 232:
                tile = new Tile("tundraHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 233:
                tile = new Tile("tundraHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 234:
                tile = new Tile("tundraHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 235:
                tile = new Tile("tundraHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 236:
                tile = new Tile("tundraHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 237:
                tile = new Tile("tundraLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 238:
                tile = new Tile("tundraMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 239:
                tile = new Tile("tundraRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 240:
                tile = new Tile("tundra.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 241:
                tile = new Tile("snowBallGround.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 242:
                tile = new Tile("snowGroundLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 243:
                tile = new Tile("snowGroundRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 244:
                tile = new Tile("snowHill.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 245:
                tile = new Tile("snowHillLow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 246:
                tile = new Tile("snowLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 247:
                tile = new Tile("snowMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 248:
                tile = new Tile("snowRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 249:
                tile = new Tile("snowWave.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 250:
                tile = new Tile("plant.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 251:
                tile = new Tile("plantAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 252:
                tile = new Tile("rock.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 253:
                tile = new Tile("rockAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 254:
                tile = new Tile("snowBallBigGround.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 255:
                tile = new Tile("spikesTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 256:
                tile = new Tile("spikesTopAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 257:
                tile = new Tile("spikesTopAlt2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 258:
                tile = new Tile("spikeTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 259:
                tile = new Tile("caneGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 260:
                tile = new Tile("caneGreenSmall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 261:
                tile = new Tile("caneGreenTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 262:
                tile = new Tile("caneGreenTopAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 263:
                tile = new Tile("caneRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 264:
                tile = new Tile("caneRedSmall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 265:
                tile = new Tile("caneRedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 266:
                tile = new Tile("caneRedTopAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 267:
                tile = new Tile("igloo.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 268:
                tile = new Tile("iglooAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 269:
                tile = new Tile("iglooDoor.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 270:
                tile = new Tile("iglooRoof.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 271:
                tile = new Tile("iglooRoofLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 272:
                tile = new Tile("iglooRoofRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 273:
                tile = new Tile("treeTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 274:
                tile = new Tile("treeTopSnow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 275:
                tile = new Tile("treeTrunkBottomAlt3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 276:
                tile = new Tile("tree.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 277:
                tile = new Tile("treeBranchesLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 278:
                tile = new Tile("treeBranchesLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 279:
                tile = new Tile("treeBranchesLeftSnowAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 280:
                tile = new Tile("treeBranchesRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 281:
                tile = new Tile("treeBranchesSnowLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 282:
                tile = new Tile("treeBranchesSnowRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 283:
                tile = new Tile("treeBranchesSnowRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 284:
                tile = new Tile("treeBranchesSnowRightSnowAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 285:
                tile = new Tile("chocoHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 286:
                tile = new Tile("chocoHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 287:
                tile = new Tile("chocoHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 288:
                tile = new Tile("chocoHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 289:
                tile = new Tile("chocoHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 290:
                tile = new Tile("chocoLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 291:
                tile = new Tile("chocoLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 292:
                tile = new Tile("chocoLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 293:
                tile = new Tile("chocoMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 294:
                tile = new Tile("chocoRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 295:
                tile = new Tile("cookieBrown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 296:
                tile = new Tile("cookieChoco.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 297:
                tile = new Tile("cookiePink.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 298:
                tile = new Tile("creamChoco.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 299:
                tile = new Tile("creamMocca.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 300:
                tile = new Tile("creamPink.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 301:
                tile = new Tile("creamVanilla.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 302:
                tile = new Tile("cupCake.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 303:
                tile = new Tile("gummyWormGreenEnd.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 304:
                tile = new Tile("gummyWormGreenHead.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 305:
                tile = new Tile("gummyWormGreenMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 306:
                tile = new Tile("gummyWormRedEnd.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 307:
                tile = new Tile("gummyWormRedHead.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 308:
                tile = new Tile("gummyWormRedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 309:
                tile = new Tile("heart.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 310:
                tile = new Tile("hillCaneChoco.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 311:
                tile = new Tile("hillCaneChocoTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 312:
                tile = new Tile("hillCaneGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 313:
                tile = new Tile("hillCaneGreenTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 314:
                tile = new Tile("hillCanePink.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 315:
                tile = new Tile("hillCanePinkTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 316:
                tile = new Tile("hillCaneRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 317:
                tile = new Tile("hillCaneRedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 318:
                tile = new Tile("lollipopBase.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 319:
                tile = new Tile("lollipopBaseBeige.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 320:
                tile = new Tile("lollipopBaseBrown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 321:
                tile = new Tile("lollipopBaseCake.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 322:
                tile = new Tile("lollipopBasePink.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 323:
                tile = new Tile("lollipopFruitGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 324:
                tile = new Tile("lollipopFruitRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 325:
                tile = new Tile("lollipopFruitYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 326:
                tile = new Tile("lollipopGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 327:
                tile = new Tile("lollipopRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 328:
                tile = new Tile("lollipopWhiteGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 329:
                tile = new Tile("lollipopWhiteRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 330:
                tile = new Tile("waffleChoco.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 331:
                tile = new Tile("wafflePink.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 332:
                tile = new Tile("waffleWhite.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 333:
                tile = new Tile("cake.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 334:
                tile = new Tile("cakeCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 335:
                tile = new Tile("cakeCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 336:
                tile = new Tile("cakeCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 337:
                tile = new Tile("cakeCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 338:
                tile = new Tile("cakeCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 339:
                tile = new Tile("cakeCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 340:
                tile = new Tile("cakeHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 341:
                tile = new Tile("cakeHalfAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 342:
                tile = new Tile("cakeHalfAltLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 343:
                tile = new Tile("cakeHalfAltMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 344:
                tile = new Tile("cakeHalfAltRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 345:
                tile = new Tile("cakeHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 346:
                tile = new Tile("cakeHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 347:
                tile = new Tile("cakeHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 348:
                tile = new Tile("cakeHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 349:
                tile = new Tile("cakeHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 350:
                tile = new Tile("cakeHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 351:
                tile = new Tile("cakeHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 352:
                tile = new Tile("cakeLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 353:
                tile = new Tile("cakeLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 354:
                tile = new Tile("cakeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 355:
                tile = new Tile("cakeMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 356:
                tile = new Tile("cakeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 357:
                tile = new Tile("candyBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 358:
                tile = new Tile("candyGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 359:
                tile = new Tile("candyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 360:
                tile = new Tile("candyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 361:
                tile = new Tile("canePink.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 362:
                tile = new Tile("canePinkSmall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 363:
                tile = new Tile("canePinkTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 364:
                tile = new Tile("canePinkTopAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 365:
                tile = new Tile("cherry.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 366:
                tile = new Tile("choco.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 367:
                tile = new Tile("chocoCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 368:
                tile = new Tile("chocoCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 369:
                tile = new Tile("chocoCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 370:
                tile = new Tile("chocoCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 371:
                tile = new Tile("chocoCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 372:
                tile = new Tile("chocoCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 373:
                tile = new Tile("chocoHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 374:
                tile = new Tile("chocoHalfAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 375:
                tile = new Tile("chocoHalfAltLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 376:
                tile = new Tile("chocoHalfAltMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 377:
                tile = new Tile("chocoHalfAltRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 378:
                tile = new Tile("chocoHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 379:
                tile = new Tile("chocoHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
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
