package net.minecraft.workbench.world;

import net.minecraft.workbench.world.block.BlockPos;

/**
 * This class is used to hold a chunk position. Chunks are always 16x16 blocks.
 */
public final class ChunkPos implements Comparable<ChunkPos> {
    private final int x;
    private final int z;

    public ChunkPos(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

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

    public double distanceToSqr(double x, double z) {
        double xPos = this.x * 16 + 8;
        double zPos = this.z * 16 + 8;

        double xd = xPos - x;
        double zd = zPos - z;

        return xd * xd + zd * zd;
    }

    public int getMiddleBlockX() {
        return (x << 4) + 8;
    }

    public int getMiddleBlockZ() {
        return (z << 4) + 8;
    }

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
