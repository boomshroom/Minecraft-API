package net.minecraft.workbench.data;

public interface Savable {
	
	DataTag<?> getData();
	
	void setData(DataTag<?> data);
	
	void save();

}
