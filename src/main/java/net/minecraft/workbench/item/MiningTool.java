package net.minecraft.workbench.item;

import net.minecraft.workbench.block.Block;

public interface MiningTool extends Tool {
	
	/**
	 * Gets how fast this tool can mine a given block
	 * 
	 * @param block the block being mined
	 * @return the mining speed for the block
	 */
	float getSpeedOnBlock(Block block);
	
	/**
	 * Gets whether the block being mined is best
	 * mined with this tool
	 * 
	 * @param block the block being mined
	 * @return whether this tool is the "right tool for the job"
	 */
	boolean isEfficientOnBlock(Block block);

}
