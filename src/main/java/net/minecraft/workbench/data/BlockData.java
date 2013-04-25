package net.minecraft.workbench.data;

import net.minecraft.workbench.block.Block;
import net.minecraft.workbench.world.block.BlockPos;

public interface BlockData extends Savable {
	DataTag<BlockPos> getPos();
	DataTag<Block> getType();
	DataTag<Short> getLightLevel();
}
