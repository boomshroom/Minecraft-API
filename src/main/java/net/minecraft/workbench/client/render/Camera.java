package net.minecraft.workbench.client.render;

public interface Camera {
	
	void setNormal();
	void setThirdPerson();
	void setSecondPerson();
	void setFixed();
	void setPos(int x,int y,int z);
	
}
