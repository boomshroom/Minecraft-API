package net.minecraft.workbench.server.inventory.recipe;

import java.util.List;

import net.minecraft.workbench.server.inventory.Inventory;

public interface RecipeUser extends Inventory{
	
	List<RecipeStyle> compatibleStyles();
	
	/**
	 * gets the slots in the inventory that
	 * are actually used in crafting
	 * 
	 * @return the slots used for the
	 * crafting matix
	 */
	int[] getIngrediantSlots();
	
	/**
	 * gets the slots in the inventory that
	 * the result(s) apear in. This may overlap
	 * the slots in getIngrediantRange in the 
	 * case of the brewing stand.
	 * 
	 * @return the slots used for the
	 * output
	 */
	int[]getProductSlots();
	

}
