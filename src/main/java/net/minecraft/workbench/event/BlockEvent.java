package net.minecraft.workbench.event;

public interface BlockEvent extends Event {

	/**
	 * 0-2: hitting entity pos
	 * 3-5: block pos
	 * 6: hitting entity id
	 * 
	 * @return 
	 */
	int[] hits();

}
