package net.minecraft.workbench.data;

public interface DataTag<V> {
	
	void save();
	
	V getValue();
	
	void setvalue(V value);
	
	void setKey(String key);
	
	String getKey();

}
