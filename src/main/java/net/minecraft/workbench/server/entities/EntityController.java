package net.minecraft.workbench.server.entities;

/**
 * An Entity Controller is something that is responsible for controling how {@link Entity}s work.
 * <p />
 * Some examples of entity controllers are {@link net.minecraft.workbench.server.entities.players.Player}s or some AI controllers.
 */
public interface EntityController {
    /**
     * Gets the {@link Entity} that is being controlled by this object.
     * <p />
     * This may be null, which indicates that this object is not currently controlling any entity (and is thus spectating).
     * If it is not null, it is a given that the entity in question will return this object for {@link net.minecraft.workbench.server.entities.Entity#getController()}.
     *
     * @return Entity being controlled currently, or null.
     */
    Entity getControlledEntity();
}
