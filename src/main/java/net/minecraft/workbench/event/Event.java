package net.minecraft.workbench.event;

public interface Event {
	
	void call();
	
	void setArgs(Object...args);
	
	void cancel();
	
	boolean isCancelled();
	
}
