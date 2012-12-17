package net.minecraft.workbench.inventory;

public interface Inventory {
	
	ItemStack getItemAt(int slot);
	
	void putItem(ItemStack item, int slot);
	
	int getSize();
	
}
