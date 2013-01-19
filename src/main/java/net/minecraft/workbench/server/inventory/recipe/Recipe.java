package net.minecraft.workbench.server.inventory.recipe;

import net.minecraft.workbench.server.inventory.ItemStack;

public interface Recipe {
	
	public ItemStack getResult();
	
	public RecipeStyle getStyle();
	
	public float getTime();
	
	public ItemStack[] getIngredients();
	
}
