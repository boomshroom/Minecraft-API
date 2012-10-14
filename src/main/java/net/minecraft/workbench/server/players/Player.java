package net.minecraft.workbench.server.players;

import net.minecraft.workbench.server.entities.EntityController;

import java.util.UUID;

/**
 * A player is another name for a client, someone who connects to the server and can control an entity.
 * <p />
 * A player is not itself explicitly an entity, but may instead control one or none. It may also own a connection, but
 * this is not required. If a player owns a connection then they are considered to be "online", otherwise they are
 * "offline". If they are online but do not control an entity, they are simply considered to be "spectating".
 * <p />
 * The entity that player controls does not need to be alive nor does it need to be humanoid. They cannot explicitly
 * control more than one entity at a time, and entities may not be controlled by more than one player.
 */
public interface Player extends EntityController {
    /**
     * Gets the {@link UUID} for this Player.
     * <p />
     * This is unique for every player, but will never change even if the player is renamed. This should be used for
     * all methods of storing, retrieving or comparing players. It is the only guaranteed reliable method of ensuring
     * guaranteed equality between two players at two different runtimes.
     *
     * @return This player's UUID.
     */
    UUID getUUID();

    /**
     * Gets the username for this player.
     * <p />
     * This name will be unique for all online players, but is not guaranteed to be the same for the player across
     * multiple sessions. A player may have their name changed at some point in time, and for this reason
     * {@link #getUUID()} should be used for instances where you need to compare equality or storage.
     *
     * @return The player's current username.
     */
    String getUsername();

    /**
     * Gets the username for this player.
     * <p />
     * This name will be unique for all online players, but is not guaranteed to be the same for the player across
     * multiple sessions. A player may have their name changed at some point in time, and for this reason
     * {@link #getUUID()} should be used for instances where you need to compare equality or storage.
     *
     * @return The player's current username.
     */
    String getDisplayName();
}
