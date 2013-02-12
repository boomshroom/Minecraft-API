package net.minecraft.workbench.world;

public interface Checkpoint extends World {
	
	void save();
	void restore();

}
