package net.minecraft.workbench.world;

/**
 * Direction denotes a world direction seen from above. It has north, south,
 * west and east, but no up and down. Direction is used by many different kinds
 * of blocks, and only requires 2 bits to be stored.
 * 
 */
public final class Direction {

    /**
     * The direction facing towards increasing Z coordinates.
     */
    public static final int SOUTH = 0;
    /**
     * The direction facing towards decreasing X coordinates.
     */
    public static final int WEST = 1;
    /**
     * The direction facing towards decreasing Z coordinates.
     */
    public static final int NORTH = 2;
    /**
     * The direction facing towards increasing X coordinates.
     */
    public static final int EAST = 3;

    /**
     * Number of direction values.
     */
    public static final int COUNT = 4;
    /**
     * The bitmask to filter direction bits.
     */
    public static final int MASK = 0x3;
    /**
     * The value of an undefined direction. Note that a undefined direction
     * can't be stored in 2 bits.
     */
    public static final int UNDEFINED = 0x7;

    /**
     * Fetches the corresponding {@link Facing} for a direction.
     * 
     * @param direction
     *            The direction.
     * @return The corresponding Facing value of a direction.
     */
    public static int getFacing(int direction) {
        if (direction == SOUTH) {
            return Facing.SOUTH;
        }
        if (direction == WEST) {
            return Facing.WEST;
        }
        if (direction == NORTH) {
            return Facing.NORTH;
        }
        if (direction == EAST) {
            return Facing.EAST;
        }
        return Facing.UNDEFINED;
    }

    /**
     * Fetches the direction directly opposite of the given direction. For
     * example, the opposite of SOUTH is NORTH.
     * 
     * @param direction
     *            The direction.
     * @return The opposite direction.
     */
    public static int getOpposite(int direction) {
        return (direction + 2) & MASK;
    }

    /**
     * Fetches the direction in clockwise order of the given direction. For
     * example, the clockwise direction of SOUTH is WEST.
     * 
     * @param direction
     *            The direction.
     * @return The clockwise direction.
     */
    public static int getClockwise(int direction) {
        return (direction + 1) & MASK;
    }

    /**
     * Fetches the direction in counter-clockwise order of the given direction.
     * For example, the counter-clockwise direction of SOUTH is EAST.
     * 
     * @param direction
     *            The direction.
     * @return The counter-clockwise direction.
     */
    public static int getCounterClockwise(int direction) {
        return (direction + 3) & MASK;
    }

    /**
     * Fetches the relative facing of a direction. This can be used when an
     * object is rotated according to a direction, and you want to get the new
     * facing for the default one. For example, fetching Facing.NORTH for an
     * object that has been rotated clockwise (Direction.NORTH changed to
     * Direction.EAST) will return Facing.EAST.
     * 
     * @param direction
     *            The current direction.
     * @param facing
     *            The facing for the object's original positioning,
     *            Direction.NORTH.
     * @return The new facing relative to the current direction.
     */
    public static int getRelativeFacing(int direction, int facing) {
        if (direction==UNDEFINED){
        	return Facing.UNDEFINED;
        }else if (facing == Facing.UP || facing == Facing.DOWN || facing == Facing.UNDEFINED) {
        
            // directions share the same up and down facings
            return facing;
        }
        else{
        	return (direction+facing-2)&Direction.MASK+2;
        }
    }

    /**
     * Fetches the X coordinate offset for a given direction.
     * 
     * @param direction
     *            The direction.
     * @return The X coordinate offset for moving "forward" in the given
     *         direction.
     */
    public static int getStepX(int direction) {
        if (direction == WEST) {
            return -1;
        }
        if (direction == EAST) {
            return 1;
        }
        return 0;
    }

    /**
     * Fetches the Z coordinate offset for a given direction.
     * 
     * @param direction
     *            The direction.
     * @return The Z coordinate offset for moving "forward" in the given
     *         direction.
     */
    public static int getStepZ(int direction) {
        if (direction == NORTH) {
            return -1;
        }
        if (direction == SOUTH) {
            return 1;
        }
        return 0;
    }

}
