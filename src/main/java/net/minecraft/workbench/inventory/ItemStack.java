package net.minecraft.workbench.inventory;

public interface ItemStack {
	
	public short getId();

	public int getAmount();
	
	public short getData();
	
	Object[] getTagData();

}
