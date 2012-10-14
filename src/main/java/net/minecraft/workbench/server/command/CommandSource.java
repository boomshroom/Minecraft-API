package net.minecraft.workbench.server.command;

public interface CommandSource {
	
	void sendCommand(Command command);
	
	Permission getPermLevel();
	
	void setPermLevel(Permission permission);

}
