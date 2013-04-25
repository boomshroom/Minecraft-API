package net.minecraft.workbench.world;

import java.util.UUID;

import net.minecraft.workbench.block.Block;
import net.minecraft.workbench.data.Config;
import net.minecraft.workbench.data.DataTag;

public interface World {
	
	Config getConfig();
	
	Chunk getChunk(ChunkPos pos);
	
	Block getBlock(int x,int y,int z);
	void setBlock(int x,int y,int z,Block block);
	void setBlock(int x,int y,int z,Block block,DataTag metadata);
	void setBlock(int x1,int y1,int z1,int x2,int y2,int z2,Block block);
	void setBlock(int x1,int y1,int z1,int x2,int y2,int z2,Block block,DataTag metadata);
	int getHeight(int x,int z);
	void setting(String key,boolean value); //?//
	
	String getName();
	UUID getUID();
}
