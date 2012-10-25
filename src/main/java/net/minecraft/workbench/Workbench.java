package net.minecraft.workbench;

import net.minecraft.workbench.server.Server;

/**
 * The backbone of Minecraft's API. This static looking class links the implementation with the rest of the API through
 * {@link WorkbenchImpl}. Static shortcut methods are also provided to some common methods elsewhere.
 */
public final class Workbench {
    private static WorkbenchImpl impl;

    /**
     * Gets the {@link WorkbenchImpl} behind the API.
     *
     * @return WorkbenchImpl object provided by the API implementation.
     */
    public static WorkbenchImpl implementation() {
        return impl;
    }

    /**
     * Utility method for retrieving the current {@link Server} object.
     * <p />
     * This is a shortcut for {@link net.minecraft.workbench.WorkbenchImpl#getServer()}.
     *
     * @return WorkbenchImpl object provided by the API implementation.
     * @see net.minecraft.workbench.WorkbenchImpl#getServer() Method being wrapped.
     */
    public static Engine getEngine() {
        return impl.getEngine();
    }

    /**
     * Allows the implementation to register its instance of {@link WorkbenchImpl}.
     * <p />
     * Should not be used by anything other than the implementation itself.
     *
     * @param value The specified WorkbenchImpl class to run as a singleton.
     * @throws IllegalArgumentException Thrown if value is null.
     */
    public static void setInstance(WorkbenchImpl value) {
        if (value == null) throw new IllegalArgumentException("Instance cannot be null");
        impl = value;
    }
}
