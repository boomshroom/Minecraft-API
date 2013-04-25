package net.minecraft.workbench.world.gen.loot;

import net.minecraft.workbench.server.inventory.ItemStack;

public interface Loot {
	ItemStack getItem();
	float chace();
}
