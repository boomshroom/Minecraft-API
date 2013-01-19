package net.minecraft.workbench.plugin.loader;

import net.minecraft.workbench.plugin.Plugin;

public interface PluginLoader {
	
	Plugin[] getPlugins();
	
	void loadPlugin(String plugin);

}
