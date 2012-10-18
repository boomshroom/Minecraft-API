package net.minecraft.workbench.server.command;

import net.minecraft.workbench.server.permission.PermissionHolder;

public interface CommandSource extends PermissionHolder{
	
	void sendCommand(Command command);

}
