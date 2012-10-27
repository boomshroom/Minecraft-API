package net.minecraft.workbench.client.render.model;

import net.minecraft.workbench.client.render.model.anim.Joint;
import net.minecraft.workbench.client.render.texture.Texture;

public interface Model {
	
	Texture getTexture(int face);
	
	Mesh getMesh();
	
	Mesh getBoundingMesh();
	
	/**
	 * The base model will call one joint 
	 * which will in turn call the next
	 * model until you get to the final
	 * model with no aditional joints, in
	 * which case, this will return null.
	 * 
	 */
	
	Joint getBaseJoint();
	
	double[] getPos();
	
/*	double getRotation();
	
	double getPitch();
	
	double getYaw();
*/
	/**
	 * This is a condensed version of the
	 * three commented out methods and
	 * returns all three values in an
	 * array
	 * 
	 */
	double[] getRotation();

}
