package net.minecraft.workbench.basic.server;

import net.minecraft.workbench.basic.server.command.BasicCommandManager;
import net.minecraft.workbench.basic.server.inventory.recipe.BasicRecipeManager;
import net.minecraft.workbench.basic.server.players.BasicBanList;
import net.minecraft.workbench.server.Server;
import net.minecraft.workbench.server.chat.command.Argument;
import net.minecraft.workbench.server.chat.command.Command;
import net.minecraft.workbench.server.chat.command.CommandManager;
import net.minecraft.workbench.server.chat.command.CommandSource;
import net.minecraft.workbench.server.entities.players.BanList;
import net.minecraft.workbench.server.inventory.recipe.RecipeManager;

public class BasicServer implements Server {

	BanList banList= new BasicBanList();
	CommandManager commands=new BasicCommandManager();
	RecipeManager recipes=new BasicRecipeManager();
	
	@Override
	public BanList getBanList() {
		return banList;
	}

	@Override
	public void setBanList(BanList banlist) {
		this.banList=banlist;
	}

	@Override
	public CommandManager getCommandManager() {
		return commands;
	}

	@Override
	public RecipeManager getRecipeManager() {
		return recipes;
	}

}
