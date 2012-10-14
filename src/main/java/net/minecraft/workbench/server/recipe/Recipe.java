package net.minecraft.workbench.server.recipe;

public interface Recipe {
	
	public ItemStack getResult();
	
	public RecipeStyle getStyle();
	
	public float getTime();
	
	public ItemStack[] getIngredients();
	
}
