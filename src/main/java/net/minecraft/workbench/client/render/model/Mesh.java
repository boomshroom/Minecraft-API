package net.minecraft.workbench.client.render.model;

public interface Mesh {
	
	int[] getVertex(int i);
	
	int[] getFace(int i);
	
	int getVerticies();
	
	int getFaces();

}
