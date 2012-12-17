package net.minecraft.workbench.example;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.workbench.Workbench;
import net.minecraft.workbench.inventory.ItemStack;
import net.minecraft.workbench.inventory.recipe.RecipeStyle;
import net.minecraft.workbench.inventory.recipe.RecipeUser;
import net.minecraft.workbench.server.entities.tile.TileEntity;

public class WorkbenchEntity implements TileEntity, RecipeUser {

	private ItemStack[] items = new ItemStack[46];
	
	@Override
	public List<RecipeStyle> compatibleStyles() {
		ArrayList<RecipeStyle> list=new ArrayList<RecipeStyle>();
		list.add(Workbench.implementation().getRecipeType("shapedRecipe"));
		list.add(Workbench.implementation().getRecipeType("shapelessRecipe"));
		return list;
	}

	@Override
	public ItemStack getItemAt(int slot) {
		return items[slot];
	}

	@Override
	public void putItem(ItemStack item, int slot) {
		items[slot]=item;
//		items.
	}

	@Override
	public int getSize() {
		return items.length;
	}

	@Override
	public int[] getIngrediantSlots() {
		return new int[] {36,37,38,39,40,41,42,43,44};
	}

	@Override
	public int[] getProductSlots() {
		return new int[] {45};
	}

}
