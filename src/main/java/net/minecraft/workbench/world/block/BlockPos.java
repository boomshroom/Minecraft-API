package net.minecraft.workbench.world.block;

import java.io.*;

import net.minecraft.workbench.world.*;

/**
 * Immutable block position class. A block position is an integer (x, y, z)
 * coordinate in the world.
 */
public final class BlockPos implements Comparable<BlockPos>, Serializable {

    private static final long serialVersionUID = -8966009362001100977L;

    private final int x;
    private final int y;
    private final int z;

    /**
     * A position at origin.
     */
    public static final BlockPos ORIGIN = new BlockPos(0, 0, 0);

    /**
     * Creates a position at (x, y, z)
     * 
     * @param x
     *            X coordinate.
     * @param y
     *            Y coordinate.
     * @param z
     *            Z coordinate.
     */
    public BlockPos(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Constructor which creates a block position by reading coordinates from a
     * {@link DataInputStream}.
     * 
     * @param in
     *            An input stream.
     * @throws IOException
     *             On read errors, for instance the stream doesn't contain three
     *             integers.
     */
    public BlockPos(DataInputStream in) throws IOException {
        this.x = in.readInt();
        this.y = in.readInt();
        this.z = in.readInt();
    }

    /**
     * Writes the block position to a {@link DataOutputStream}. This will add 12
     * bytes to the stream.
     * 
     * @param out
     *            An output stream.
     * @throws IOException
     *             If a write error occurs.
     */
    public void write(DataOutputStream out) throws IOException {
        out.writeInt(x);
        out.writeInt(y);
        out.writeInt(z);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BlockPos)) {
            return false;
        }

        BlockPos p = (BlockPos) other;
        return x == p.x && y == p.y && z == p.z;
    }

    @Override
    public int hashCode() {
        return (y & 0xff) | ((x & 0x7fff) << 8) | ((z & 0x7fff) << 24) | ((x < 0) ? 0x0080000000 : 0) | ((z < 0) ? 0x0000008000 : 0);
    }

    public int compareTo(BlockPos pos) {
    	int xdiff = x-pos.x;
    	int ydiff = y-pos.y;
    	int zdiff = z-pos.z;
    	double xydiff=Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    	return (int) Math.sqrt(xydiff*xydiff+zdiff*zdiff);
    }

    /**
     * Fetches X.
     * 
     * @return The x coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Fetches Y.
     * 
     * @return The y coordinate.
     */
    public int getY() {
        return y;
    }

    /**
     * Fetches Z.
     * 
     * @return The z coordinate.
     */
    public int getZ() {
        return z;
    }

    /**
     * Creates a position at a relative offset to this.
     * 
     * @param x
     *            X offset.
     * @param y
     *            Y offset.
     * @param z
     *            Z offset.
     * @return A new block position at the relative offset.
     */
    public BlockPos offset(int x, int y, int z) {
        return new BlockPos(this.x + x, this.y + y, this.z + z);
    }

    /**
     * Creates a position at a relative offset to this, using a number of steps
     * in a certain facing.
     * 
     * @param facing
     *            The {@link Facing}.
     * @param steps
     *            Number of steps.
     * @return A new block position 'steps' away in the given facing.
     */
    public BlockPos facingOffset(int facing, int steps) {
        return new BlockPos(this.x + Facing.getStepX(facing) * steps, this.y + Facing.getStepY(facing) * steps, this.z + Facing.getStepZ(facing) * steps);
    }

    /**
     * Creates a position at a relative offset to this, using a number of steps
     * in a certain direction.
     * 
     * @param facing
     *            The {@link Direction}.
     * @param steps
     *            Number of steps.
     * @return A new block position 'steps' away in the given direction.
     */
    public BlockPos directionOffset(int direction, int steps) {
        return new BlockPos(this.x + Direction.getStepX(direction) * steps, this.y, this.z + Direction.getStepZ(direction) * steps);
    }

    /**
     * Creates a position one block above this coordinate.
     * 
     * @return A new block position one step above this coordinate.
     */
    public BlockPos above() {
        return new BlockPos(x, y + 1, z);
    }

    /**
     * Creates a position a number of steps above this coordinate.
     * 
     * @param steps
     *            Number of steps to take.
     * @return A new block position 'steps' positions above this coordinate.
     */
    public BlockPos above(int steps) {
        return new BlockPos(x, y + steps, z);
    }

    /**
     * Creates a position one block below this coordinate.
     * 
     * @return A new block position one step below this coordinate.
     */
    public BlockPos below() {
        return new BlockPos(x, y - 1, z);
    }

    /**
     * Creates a position a number of steps below this coordinate.
     * 
     * @param steps
     *            Number of steps to take.
     * @return A new block position 'steps' positions below this coordinate.
     */
    public BlockPos below(int steps) {
        return new BlockPos(x, y - steps, z);
    }

    /**
     * Creates a position one block to the north of this coordinate.
     * 
     * @return A new block position one step to the north of this coordinate.
     */
    public BlockPos north() {
        return new BlockPos(x, y, z - 1);
    }

    /**
     * Creates a position a number of steps to the north of this coordinate.
     * 
     * @param steps
     *            Number of steps to take.
     * @return A new block position 'steps' positions to the north of this
     *         coordinate.
     */
    public BlockPos north(int steps) {
        return new BlockPos(x, y, z - steps);
    }

    /**
     * Creates a position one block to the south of this coordinate.
     * 
     * @return A new block position one step to the south of this coordinate.
     */
    public BlockPos south() {
        return new BlockPos(x, y, z + 1);
    }

    /**
     * Creates a position a number of steps to the south of this coordinate.
     * 
     * @param steps
     *            Number of steps to take.
     * @return A new block position 'steps' positions to the south of this
     *         coordinate.
     */
    public BlockPos south(int steps) {
        return new BlockPos(x, y, z + steps);
    }

    /**
     * Creates a position one block to the west of this coordinate.
     * 
     * @return A new block position one step to the west of this coordinate.
     */
    public BlockPos west() {
        return new BlockPos(x - 1, y, z);
    }

    /**
     * Creates a position a number of steps to the west of this coordinate.
     * 
     * @param steps
     *            Number of steps to take.
     * @return A new block position 'steps' positions to the west of this
     *         coordinate.
     */
    public BlockPos west(int steps) {
        return new BlockPos(x - steps, y, z);
    }

    /**
     * Creates a position one block to the east of this coordinate.
     * 
     * @return A new block position one step to the east of this coordinate.
     */
    public BlockPos east() {
        return new BlockPos(x + 1, y, z);
    }

    /**
     * Creates a position a number of steps to the east of this coordinate.
     * 
     * @param steps
     *            Number of steps to take.
     * @return A new block position 'steps' positions to the east of this
     *         coordinate.
     */
    public BlockPos east(int steps) {
        return new BlockPos(x + steps, y, z);
    }

    /**
     * Fetches the distance between this position and a given coordinate.
     * 
     * @param x
     *            The x coordinate.
     * @param y
     *            The y coordinate.
     * @param z
     *            The z coordinate.
     * @return The distance to the given coordinate.
     */
    public double dist(int x, int y, int z) {
        int dx = this.x - x;
        int dy = this.y - y;
        int dz = this.z - z;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    /**
     * Fetches the distance between this position and another.
     * 
     * @param pos
     *            The other coordinate.
     * @return The distance to the given coordinate.
     */
    public double dist(BlockPos pos) {
        return dist(pos.x, pos.y, pos.z);
    }

    /**
     * Fetches the squared distance between this position and a given
     * coordinate.
     * 
     * @param x
     *            The x coordinate.
     * @param y
     *            The y coordinate.
     * @param z
     *            The z coordinate.
     * @return The squared distance to the given coordinate.
     */
    public double distSqr(int x, int y, int z) {
        int dx = this.x - x;
        int dy = this.y - y;
        int dz = this.z - z;
        return dx * dx + dy * dy + dz * dz;
    }

    /**
     * Fetches the squared distance between this position and a given
     * coordinate.
     * 
     * @param x
     *            The x coordinate.
     * @param y
     *            The y coordinate.
     * @param z
     *            The z coordinate.
     * @return The squared distance to the given coordinate.
     */
    public double distSqr(float x, float y, float z) {
        float dx = (float) this.x - x;
        float dy = (float) this.y - y;
        float dz = (float) this.z - z;
        return (double) (dx * dx + dy * dy + dz * dz);
    }

    /**
     * Fetches the squared distance between this position and a given
     * coordinate.
     * 
     * @param x
     *            The x coordinate.
     * @param y
     *            The y coordinate.
     * @param z
     *            The z coordinate.
     * @return The squared distance to the given coordinate.
     */
    public double distSqr(double x, double y, double z) {
        double dx = (double) this.x - x;
        double dy = (double) this.y - y;
        double dz = (double) this.z - z;
        return (dx * dx + dy * dy + dz * dz);
    }

    /**
     * Fetches the squared distance between this position and another.
     * 
     * @param pos
     *            The other coordinate.
     * @return The squared distance to the given coordinate.
     */
    public double distSqr(BlockPos pos) {
        return distSqr(pos.x, pos.y, pos.z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

}
