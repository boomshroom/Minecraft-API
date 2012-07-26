package net.minecraft.workbench;

/**
 * The backbone of Minecraft's API. This static looking class links the implementation with the rest of the API,
 * allowing it to control the creation of objects itself.
 */
public abstract class Workbench {
    private static Workbench impl;

    /**
     * Gets the name of the implementation of Workbench.
     *
     * @return Name of the implementation.
     */
    public abstract String getImplementationName();

    /**
     * Gets the version of the implementation of Workbench.
     *
     * @return Version of the implementation.
     */
    public abstract String getImplementationVersion();

    /**
     * Allows the implementation to register its instance of this class.
     * <p />
     * Should not be used by anything other than the implementation itself.
     *
     * @param value New instance of this Workbench class
     * @throws IllegalArgumentException Thrown if value is null
     */
    protected static void setInstance(Workbench value) {
        if (value == null) throw new IllegalArgumentException("Instance cannot be null");
        impl = value;
    }
}
