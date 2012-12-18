package net.minecraft.workbench.inventory;

import net.minecraft.workbench.data.Savable;

public interface Inventory extends Savable{
	
	ItemStack getItemAt(int slot);
	
	void putItem(ItemStack item, int slot);
	
	int getSize();
	
}
