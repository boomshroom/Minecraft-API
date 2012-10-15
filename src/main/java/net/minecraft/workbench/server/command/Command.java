package net.minecraft.workbench.server.command;

public interface Command {
	
	String getTitle();
	
	Argument<?>[] getArguments();
	
	public void setTitle(String title);
	
	public void setArguments(Argument<?> ... args);
	
	public void onProcessed(Object ... args);
	
	void onProcessed(String ... args);
	
	String getHelp();

}
