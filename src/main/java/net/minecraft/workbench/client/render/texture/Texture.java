package net.minecraft.workbench.client.render.texture;

public interface Texture {
	
	int getColor(int x,int y);
	
	int getFrame();
	
	String getFileName();
	
	short getType();
	
//	int getAverage();

}
