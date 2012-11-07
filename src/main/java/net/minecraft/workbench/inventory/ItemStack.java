package net.minecraft.workbench.inventory;

public interface ItemStack {
	
	public String getId();

	public int getAmount();
	
	public short getData();
	
	Object[] getTagData();

}
