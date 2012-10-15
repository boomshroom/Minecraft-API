package net.minecraft.workbench.inventory.recipe;

import net.minecraft.workbench.inventory.ItemStack;

public interface RecipeStyle {
	
	public String getName();
	
	public void processRecipe(Recipe recipe);
	
	public boolean isRecipe(ItemStack[] ingredients);

}
