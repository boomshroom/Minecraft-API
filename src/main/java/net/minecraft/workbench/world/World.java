package net.minecraft.workbench.world;

import net.minecraft.workbench.data.Config;

public interface World {
	
	Config getConfig();
	
	Chunk getChunk(ChunkPos pos);

}
