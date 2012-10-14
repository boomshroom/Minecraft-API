package net.minecraft.workbench.server.entities;

/**
 * An Entity is an object that may be located within a world on the {@link net.minecraft.workbench.server.Server}.
 * <p />
 * Entities may be controlled by an {@link EntityController} and
 */
public interface Entity {
    /**
     * Gets the {@link EntityController} responsible for this entity currently.
     * <p />
     * This will not be null. Examples of valid entity controllers are {@link net.minecraft.workbench.server.players.Player}s
     * or custom classes implenting the {@link EntityController} interface for (as an example) AI purposes.
     * <p />
     * It is a given that the controller returned by this object will return this entity via {@link net.minecraft.workbench.server.entities.EntityController#getControlledEntity()}.
     *
     * @return Controller responsible for this entity.
     */
    EntityController getController();
}
