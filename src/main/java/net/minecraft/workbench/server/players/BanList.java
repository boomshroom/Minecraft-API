package net.minecraft.workbench.server.players;

import java.util.Map;

/**
 * Classes that implement this interface may control ban lists.
 * <p />
 * Ban lists are an arbitrary list of entries that are responsible for allowing or disallowing certain players from
 * joining a server (for example, but they may be used elsewhere).
 */
public interface BanList {
    /***
     * Gets whether or not this ban list is turned on.
     *
     * @return True if this ban list is enabled, otherwise false.
     */
    boolean isEnabled();

    /***
     * Sets whether or not this ban list should be turned on.
     *
     * @param enabled True if this ban list is enabled, otherwise false.
     */
    void setEnabled(boolean enabled);

    /**
     * Gets a map containing all {@link BanEntry}s, with the players name as a key to their entry object.
     *
     * @return Map containing all known ban entries.
     */
    Map<String, BanEntry> getEntries();

    /**
     * Checks whether or not the given player name is banned.
     *
     * @param name Name of the player to check.
     * @return True if the player is banned (and thus disallowed), otherwise false.
     * @throws IllegalArgumentException Thrown if the given entry is null.
     */
    boolean isBanned(String name);

    /**
     * Registers a new {@link BanEntry} into the list.
     * <p />
     * If an entry already exists with the same name as the new entry, the old entry will be overwritten.
     *
     * @param entry New ban entry to add.
     * @throws IllegalArgumentException Thrown if the given entry is null.
     */
    void add(BanEntry entry);

    /**
     * Removes a {@link BanEntry} for the given player name.
     * <p />
     * If a ban entry did not already exist for the player, null will be returned and nothing will happen.
     *
     * @param name Name of the player to remove the ban on.
     * @return The entry that was previously in place for this player, or null if none existed.
     * @throws IllegalArgumentException Thrown if the given entry is null.
     */
    BanEntry remove(String name);
}
