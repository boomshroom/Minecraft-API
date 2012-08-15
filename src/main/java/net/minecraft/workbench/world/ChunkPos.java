package net.minecraft.workbench.world;

import net.minecraft.workbench.world.block.BlockPos;

/**
 * This class is used to hold a chunk position. Chunks are always 16x16 blocks.
 */
public final class ChunkPos implements Comparable<ChunkPos> {
    private final int x;
    private final int z;

    /**
     * Creates a chunk position located at (x, z)
     * 
     * @param x
     *            Chunk x coordinate
     * @param z
     *            Chunk z coordinate
     */
    public ChunkPos(int x, int z) {
        this.x = x;
        this.z = z;
    }

    /**
     * Fetches x coordinate.
     * 
     * @return The x coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Fetches z coordinate.
     * 
     * @return The z coordinate.
     */
    public int getZ() {
        return z;
    }

    /**
     * Chunk position hash method. The method is used by the chunk position to
     * create hash, but also for other callers to find a chunk in a hashmap from
     * (x, z).
     * 
     * @param x
     *            Chunk x coordinate
     * @param z
     *            Chunk z coordinate
     * @return The hashvalue for (x, z)
     */
    public static long hashCode(int x, int z) {
        return ((long) x & 0xffffffffL) | (((long) z & 0xffffffffL) << 32L);
    }

    @Override
    public int hashCode() {
        long hash = hashCode(x, z);
        int h1 = (int) (hash);
        int h2 = (int) (hash >> 32L);
        return h1 ^ h2;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ChunkPos) {
            ChunkPos cp = (ChunkPos) o;
            return cp.x == x && cp.z == z;
        }
        return false;
    }

    /**
     * Returns the block distance between the center position of the chunk to a
     * given world position.
     * 
     * @param x
     *            The world position x coordinate
     * @param z
     *            The world position z coordinate
     * @return The squared distance from the center position of the chunk to the
     *         given world coordinate.
     */
    public double distanceToSqr(double x, double z) {
        double xPos = this.x * 16 + 8;
        double zPos = this.z * 16 + 8;

        double xd = xPos - x;
        double zd = zPos - z;

        return xd * xd + zd * zd;
    }

    /**
     * Fetches the chunk's middle block x position.
     * 
     * @return The chunk's middle block x position.
     */
    public int getMiddleBlockX() {
        return (x << 4) + 8;
    }

    /**
     * Fetches the chunk's middle block z position.
     * 
     * @return The chunk's middle block z position.
     */
    public int getMiddleBlockZ() {
        return (z << 4) + 8;
    }

    /**
     * Fetches the chunk's middle block position at a given height coordinate.
     * 
     * @param y
     *            The height coordinate.
     * @return The chunk's middle block position.
     */
    public BlockPos getMiddleBlockPosition(int y) {
        return new BlockPos(getMiddleBlockX(), y, getMiddleBlockZ());
    }

    @Override
    public String toString() {
        return "[" + x + ", " + z + "]";
    }

    public int compareTo(ChunkPos other) {
        if (z == other.z) {
            return x - other.x;
        }
        return z - other.z;
    }

}
