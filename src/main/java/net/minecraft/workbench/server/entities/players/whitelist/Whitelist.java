package net.minecraft.workbench.server.entities.players.whitelist;

import java.util.Map;

public interface Whitelist {
	boolean isEnabled();
	void setEnabled(boolean enabled);
	Map<String,WLEntry> getEntries();
	boolean isWhitelisted(String name);
	void add(WLEntry entry);
	WLEntry remove(String name);
}
