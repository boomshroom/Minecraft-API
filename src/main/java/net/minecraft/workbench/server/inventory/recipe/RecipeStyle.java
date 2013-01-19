package net.minecraft.workbench.server.inventory.recipe;

import net.minecraft.workbench.server.inventory.ItemStack;

public interface RecipeStyle {
	
	public String getName();
	
	public void processRecipe(Recipe recipe);
	
	public boolean isRecipe(ItemStack[] ingredients);
	
	public void addRecipe(Recipe recipe);
	
	public Recipe getRecipe(ItemStack[] ingredients);
	
	public void removeRecipe(Recipe recipe);

}
