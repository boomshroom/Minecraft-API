package net.minecraft.workbench.example;

import net.minecraft.workbench.block.Block;
import net.minecraft.workbench.client.render.model.Model;
import net.minecraft.workbench.inventory.ItemStack;
import net.minecraft.workbench.server.entities.tile.TileEntity;

public class WorkbenchBlock implements Block {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Model getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getFriction() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short getEmitedLight(short side, short[] lightFromSides) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void onRightClick(ItemStack item) {
		// TODO Auto-generated method stub

	}

	@Override
	public TileEntity getEntity() {
		// TODO Auto-generated method stub
		return new WorkbenchEntity();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}