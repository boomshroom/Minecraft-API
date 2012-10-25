package net.minecraft.workbench.client.render.model;

import net.minecraft.workbench.client.render.model.anim.Joint;
import net.minecraft.workbench.client.render.texture.Texture;

public interface Model {
	
	Texture getTexture(int face);
	
	Mesh getMesh();
	
	Mesh getBoundingMesh();
	
	Joint getBaseJoint();

}
