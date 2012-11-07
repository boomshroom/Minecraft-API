package net.minecraft.workbench.item;

import net.minecraft.workbench.client.render.model.Model;
import net.minecraft.workbench.client.render.texture.Texture;

public interface Item {
	
	String getName();
	
	Model getHandModel();
	
	Texture getInvTexture();

}
