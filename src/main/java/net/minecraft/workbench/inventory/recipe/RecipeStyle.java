package net.minecraft.workbench.inventory.recipe;

import net.minecraft.workbench.inventory.ItemStack;

public interface RecipeStyle {
	
	public String getName();
	
	public void processRecipe(Recipe recipe);
	
	public boolean isRecipe(ItemStack[] ingredients);
	
	public void addRecipe(Recipe recipe);
	
	public Recipe getRecipe(ItemStack[] ingredients);
	
	public void removeRecipe(Recipe recipe);

}
