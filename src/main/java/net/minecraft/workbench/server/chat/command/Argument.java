package net.minecraft.workbench.server.chat.command;

public interface Argument <T> {
	
	Class<T> getRepresentation();

}
