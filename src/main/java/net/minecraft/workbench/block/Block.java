package net.minecraft.workbench.block;

import net.minecraft.workbench.client.render.BlockRender;
import net.minecraft.workbench.data.Savable;
import net.minecraft.workbench.server.entities.tile.TileEntity;
import net.minecraft.workbench.server.inventory.ItemStack;

public interface Block extends Savable{
	
	String getName();
	
	BlockRender getRender();
	
	float getFriction();
	
	short getEmitedLight(short side, short[] lightFromSides);
	
	void onRightClick(ItemStack item);
	
	TileEntity createEntity();
	
}
