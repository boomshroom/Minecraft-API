package net.minecraft.workbench.inventory.recipe;

import net.minecraft.workbench.inventory.ItemStack;

public interface Recipe {
	
	public ItemStack getResult();
	
	public RecipeStyle getStyle();
	
	public float getTime();
	
	public ItemStack[] getIngredients();
	
}
