package net.minecraft.workbench.server.inventory.recipe;

public interface RecipeManager {
	
	RecipeStyle getRecipeType(String name);
	
	void registerRecipeStyle(RecipeStyle style);

}
