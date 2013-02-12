package net.minecraft.workbench.basic.server.command;

import java.util.ArrayList;

import net.minecraft.workbench.server.chat.command.Argument;
import net.minecraft.workbench.server.chat.command.Command;
import net.minecraft.workbench.server.chat.command.CommandManager;
import net.minecraft.workbench.server.chat.command.CommandSource;

public class BasicCommandManager implements CommandManager {

	ArrayList<Command> commands=new ArrayList<Command>();
	
	@Override
	public void registerCommand(Command command) {
		commands.add(command);
	}

	@Override
	public void sendCommand(Command command, CommandSource source,Object... args) {
		command.process(source, args);
	}

	@Override
	public Command getCommand(String title, Argument<?>... args) {
		for(Command command:commands){
			if (command.getTitle()==title&&command.getArguments()==args){
				return command;
			}
		}
		return null;
	}

	@Override
	public void unregisterCommand(Command command) {
		commands.remove(command);
	}

	@Override
	public Command[] getCommands() {
		return (Command[]) commands.toArray();
	}

}
