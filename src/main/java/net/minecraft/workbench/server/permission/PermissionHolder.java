package net.minecraft.workbench.server.permission;

public interface PermissionHolder {
	
	boolean hasPermission(Permission perm);
	
	void setPermission(Permission permission, boolean enable);
}
