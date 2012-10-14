package net.minecraft.workbench.server.command;

public interface Argument <T> {
	
	Class<T> getRepresentation();

}
