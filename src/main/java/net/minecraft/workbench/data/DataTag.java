package net.minecraft.workbench.data;

public interface DataTag<T> {
	
	void save();
	
	T getData();
	
	void setData(T data);

}
