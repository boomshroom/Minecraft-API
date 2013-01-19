package net.minecraft.workbench.server.command;

public interface CommandManager {
	
    void registerCommand(Command command);
    
    void sendCommand(Command command, CommandSource source, Object...args);
    
    Command getCommand(String title, Argument<?>...args);
    
    void unregisterCommand(Command command);
    
    Command[] getCommands();

}
