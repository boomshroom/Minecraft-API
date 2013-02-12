package net.minecraft.workbench.basic.server.players;

import java.util.Map;

import net.minecraft.workbench.server.entities.players.BanEntry;
import net.minecraft.workbench.server.entities.players.BanList;

public class BasicBanList implements BanList {

	@Override
	public boolean isEnabled() {
		return false;
	}

	@Override
	public void setEnabled(boolean enabled) {

	}

	@Override
	public Map<String, BanEntry> getEntries() {
		return null;
	}

	@Override
	public boolean isBanned(String name) {
		return false;
	}

	@Override
	public void add(BanEntry entry) {

	}

	@Override
	public BanEntry remove(String name) {
		return null;
	}

}
