package net.minecraft.workbench.server;

import net.minecraft.workbench.server.command.Argument;
import net.minecraft.workbench.server.command.Command;
import net.minecraft.workbench.server.command.CommandSource;
import net.minecraft.workbench.server.players.BanList;
import net.minecraft.workbench.server.recipe.Recipe;

/**
 * Classes that implement this interface are responsible for controlling various server related methods.
 * These can range from altering server properties (port number), world configurations (adding a new dimension), or
 * accessing the player list.
 */
public interface Server {
    /**
     * Gets the {@link BanList} currently responsible for controlling which players may not join the server.
     * <p />
     * If you wish to replace this ban list with your own implementation, you may do so with {@link #setBanList(BanList)}.
     *
     * @return Current ban provider.
     */
    BanList getBanList();

    /**
     * Sets the {@link BanList} that will be responsible for controlling which players may not join the server.
     *
     * @param banlist Current ban provider.
     * @throws IllegalArgumentException Thrown if banlist is null.
     */
    void setBanList(BanList banlist);
    
    // Added recipe methods
    
    void addRecipe(Recipe recipe);
    
    void removeRecipe(Recipe recipe);
    
    Recipe getRecipe(Object ... objects);

    //Command Methods
    void registerCommand(Command command);
    
    void sendCommand(Command command, CommandSource source, Object...args);
    
    Command getCommand(String title, Argument...args);
    
    void unregisterCommand(Command command);
    
    Command[] getCommands();
}