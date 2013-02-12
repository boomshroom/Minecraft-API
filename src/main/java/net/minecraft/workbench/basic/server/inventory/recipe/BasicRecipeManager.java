package net.minecraft.workbench.basic.server.inventory.recipe;

import java.util.ArrayList;

import net.minecraft.workbench.server.inventory.recipe.RecipeManager;
import net.minecraft.workbench.server.inventory.recipe.RecipeStyle;

public class BasicRecipeManager implements RecipeManager {

	ArrayList<RecipeStyle> styles=new ArrayList<RecipeStyle>();
	
	@Override
	public RecipeStyle getRecipeType(String name) {
		return null;
	}

	@Override
	public void registerRecipeStyle(RecipeStyle style) {
		// TODO Auto-generated method stub
		
	}

}
