package net.minecraft.workbench.world;


/**
 * Facing is a direction in the world with 6 possible values: down, up, north,
 * south, west and east. It requires 3 bits to be stored.
 */
public final class Facing {

    /**
     * Down is the facing pointing towards decreasing Y coordinates, the void.
     */
    public static final int DOWN = 0;
    /**
     * Up is the facing pointing towards increasing Y coordinates, the sky.
     */
    public static final int UP = 1;
    /**
     * North is the facing pointing towards decreasing Z coordinates.
     */
    public static final int NORTH = 2;
    /**
     * South is the facing pointing towards increasing Z coordinates.
     */
    public static final int SOUTH = 3;
    /**
     * West is the facing pointing towards decreasing X coordinates.
     */
    public static final int WEST = 4;
    /**
     * East is the facing pointing towards increasing X coordinates.
     */
    public static final int EAST = 5;

    /**
     * The total number of valid facings.
     */
    public static final int COUNT = 6;
    /**
     * The bitmask used to cover all facings.
     */
    public static final int MASK = 0x7;
    /**
     * Value used for undefined facings.
     */
    public static final int UNDEFINED = 0x7;

    /**
     * Calculates the facing which is opposite of the given facing. For example,
     * Facing.NORTH will return the value of Facing.SOUTH.
     * <p />
     * The method is not intended to compensate for Facing.UNDEFINED.
     * 
     * @param facing
     *            The facing to be inverted.
     * @return The value of opposite facing.
     */
    public static int getOpposite(int facing) {
        return (facing & ~1) | (facing & 1) ^ 1;
    }

    /**
     * Fetches the corresponding {@link Direction} value for the facing, or
     * {@link Direction.UNDEFINED} if there is no matching direction for the
     * given facing.
     * 
     * @param facing
     *            The facing.
     * @return A direction value, or {@link Direction.UNDEFINED} if there is no
     *         matching direction.
     */
    public static int getDirection(int facing) {
        if (facing == WEST) {
            return Direction.WEST;
        }
        if (facing == EAST) {
            return Direction.EAST;
        }
        if (facing == NORTH) {
            return Direction.NORTH;
        }
        if (facing == SOUTH) {
            return Direction.SOUTH;
        }
        return Direction.UNDEFINED;
    }

    /**
     * Fetches the X coordinate offset for a given facing.
     * 
     * @param facing
     *            The facing.
     * @return The X coordinate offset for moving "forward" in the given facing.
     */
    public static int getStepX(int facing) {
        if (facing == WEST) {
            return -1;
        }
        if (facing == EAST) {
            return 1;
        }
        return 0;
    }

    /**
     * Fetches the Y coordinate offset for a given facing.
     * 
     * @param facing
     *            The facing.
     * @return The Y coordinate offset for moving "forward" in the given facing.
     */
    public static int getStepY(int facing) {
        if (facing == DOWN) {
            return -1;
        }
        if (facing == UP) {
            return 1;
        }
        return 0;
    }

    /**
     * Fetches the Z coordinate offset for a given facing.
     * 
     * @param facing
     *            The facing.
     * @return The Z coordinate offset for moving "forward" in the given facing.
     */

    public static int getStepZ(int facing) {
        if (facing == NORTH) {
            return -1;
        }
        if (facing == SOUTH) {
            return 1;
        }
        return 0;
    }

}
