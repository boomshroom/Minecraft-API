package net.minecraft.workbench.example;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.workbench.inventory.ItemStack;
import net.minecraft.workbench.inventory.recipe.Recipe;
import net.minecraft.workbench.inventory.recipe.RecipeStyle;

public class ShapedRecipe implements RecipeStyle {

	List<Recipe> recipes=new ArrayList<Recipe>();
	
	@Override
	public String getName() {
		return "shapedRecipe";
	}

	@Override
	public void processRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isRecipe(ItemStack[] ingredients) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Recipe getRecipe(ItemStack[] ingredients) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		
	}

}
