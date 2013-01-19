package net.minecraft.workbench.server.entities.tile;

import net.minecraft.workbench.block.Block;
import net.minecraft.workbench.data.Savable;

public interface TileEntity extends Savable{
	
	Block getBlock();

}
