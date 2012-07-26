package net.minecraft.workbench.server;

import net.minecraft.workbench.server.players.BanList;

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
}
