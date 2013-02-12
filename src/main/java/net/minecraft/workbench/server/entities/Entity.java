package net.minecraft.workbench.server.entities;

import net.minecraft.workbench.client.render.EntityRender;
import net.minecraft.workbench.data.Savable;
import net.minecraft.workbench.server.source.DammageSource;

/**
 * An Entity is an object that may be located within a world on the {@link net.minecraft.workbench.server.Server}.
 * <p />
 * Entities may be controlled by an {@link EntityController} and
 */
public interface Entity extends Savable{
    /**
     * Gets the {@link EntityController} responsible for this entity currently.
     * <p />
     * This will not be null. Examples of valid entity controllers are {@link net.minecraft.workbench.server.entities.players.Player}s
     * or custom classes implenting the {@link EntityController} interface for (as an example) AI purposes.
     * <p />
     * It is a given that the controller returned by this object will return this entity via {@link net.minecraft.workbench.server.entities.EntityController#getControlledEntity()}.
     *
     * @return Controller responsible for this entity.
     */
    EntityController getController();
    
    EntityRender getRender();
    
    int getHealth();
    
    int getMaxHealth();
    
    void dammage(DammageSource source);
    
    void setHealth(int health);
    
    void setMaxHealth(int health);
    
    void getExperiance();
    
    int[] getTile();
    void setTile(int x,int y,int z);
    float[] getPos();
    void setPos(float x,float y,float z);
}
