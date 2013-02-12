package net.minecraft.workbench.server.chat.command;

public interface Command {
	
	String getTitle();
	
	Argument<?>[] getArguments();
	
	void setTitle(String title);
	
	void setArguments(Argument<?> ... args);
	
	void process(CommandSource source,Object ... args);
	
	void process(CommandSource source,String ... args);
	
	String getHelp();

}
