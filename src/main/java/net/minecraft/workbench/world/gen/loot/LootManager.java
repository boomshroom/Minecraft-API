package net.minecraft.workbench.world.gen.loot;

import java.util.ArrayList;

public interface LootManager {
	void registerLoot(Loot loot, String type);
	ArrayList<Loot> getLoot(String type);
}
