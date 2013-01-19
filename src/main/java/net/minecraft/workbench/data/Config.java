package net.minecraft.workbench.data;

public interface Config {
	
	void addTag(DataTag tag);
	
	DataTag getTag(String name);

}
