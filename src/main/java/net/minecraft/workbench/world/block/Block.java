package net.minecraft.workbench.world.block;

import net.minecraft.workbench.data.BlockData;
import net.minecraft.workbench.server.entities.tile.TileEntity;

public interface Block {
	
	net.minecraft.workbench.block.Block getBlockType();
	int getType(); // kept for conmpatibility
	
	BlockPos getPosition(int x, int y,int z);
	
	byte getMetadata(); // kept for conmpatibility
	byte getLightLevel();
	
	TileEntity getEntity(); // use these instead
	BlockData getData();
	
}