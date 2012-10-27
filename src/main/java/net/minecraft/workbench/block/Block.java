package net.minecraft.workbench.block;

import net.minecraft.workbench.client.render.model.Model;

public interface Block {
	
	Model getModel();
	
	float getFriction();
	
	short getEmitedLight(short side, short[] lightFromSides);

}
