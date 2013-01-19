package net.minecraft.workbench.world;

import net.minecraft.workbench.block.Block;
import net.minecraft.workbench.world.block.BlockPos;

public interface Chunk {
	
	ChunkPos getPos();
	
	void setPos(ChunkPos pos);
	
	Block[] getBlocks();
	
	void setBlock(Block block, BlockPos pos);
	
	Block getBlock(BlockPos pos);
}
