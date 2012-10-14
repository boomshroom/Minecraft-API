package net.minecraft.workbench.server.recipe;

public interface RecipeStyle {
	
	public String getName();
	
	public void processRecipe(Recipe recipe);
	
	public boolean isRecipe(ItemStack[] ingredients);

}
