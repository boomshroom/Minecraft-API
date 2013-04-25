package net.minecraft.workbench.server.entities.players.ban;

import java.util.Date;

/**
 * Represents an entry into a {@link BanList}.
 * <p />
 * The implementation to this class is usually provided by the same provider of {@link BanList}.
 */
public interface BanEntry {
    /**
     * Gets the name of the player that this ban entry is for.
     * <p />
     * This name may be incorrectly cased and as a result should not be used in case sensitive operations when matching
     * with players.
     *
     * @return Name of the player that is banned.
     */
    String getName();

    /**
     * Gets the {@link Date} that this entry was created.
     *
     * @return Date that this ban was placed.
     */
    Date getCreated();

    /**
     * Sets the {@link Date} that this entry should appear to be created from.
     *
     * @param created New creation date.
     * @throws IllegalArgumentException Thrown if created is null.
     */
    void setCreated(Date created);

    /**
     * Gets the source of this ban.
     * <p />
     * A source of a ban is often a name of a player that requested the ban, or if automated then the name of the
     * plugin that required it.
     * <p />
     * Null is not a valid source, but "Unknown" may be provided in its stead.
     *
     * @return A short string indicating where this ban originated from.
     */
    String getSource();

    /**
     * Sets the source of this ban.
     * <p />
     * A source of a ban is often a name of a player that requested the ban, or if automated then the name of the
     * plugin that required it.
     * <p />
     * Null is not a valid source, but "Unknown" may be provided in its stead.
     *
     * @param source A short string indicating where this ban originated from.
     * @throws IllegalArgumentException Thrown if source is null.
     */
    void setSource(String source);

    /**
     * Gets the {@link Date} that this entry should expire on.
     * <p />
     * Null is a valid expire date, which will mean this ban should never expire.
     *
     * @return Date that this entry should expire on, or null if never.
     */
    Date getExpires();

    /**
     * Sets the {@link Date} that this entry should expire on.
     * <p />
     * Null is a valid expire date, which will mean this ban should never expire.
     *
     * @param expires Date that this entry should expire on, or null if never.
     */
    void setExpires(Date expires);

    /**
     * Checks if this ban entry has expired yet.
     * <p />
     * A value of true will indicate that this ban is no longer valid and should be removed.
     *
     * @return True if this ban is no longer valid.
     */
    boolean hasExpired();

    /**
     * Gets a short reason provided for this ban.
     * <p />
     * Null is not a valid reason. This reason will be displayed to the player if they attempt to join, so
     * "Banned from the server" may be an appropriate default.
     *
     * @return Short reason for this ban entry.
     */
    String getReason();

    /**
     * Sets a short reason provided for this ban.
     * <p />
     * Null is not a valid reason. This reason will be displayed to the player if they attempt to join, so
     * "Banned from the server" may be an appropriate default.
     *
     * @param reason Short reason for this ban entry.
     * @throws IllegalArgumentException Thrown if reason is null.
     */
    void setReason(String reason);
    
    //added type methods
    
    short getType();
    
    short setType();
    
    void setIP(String ip);
}
