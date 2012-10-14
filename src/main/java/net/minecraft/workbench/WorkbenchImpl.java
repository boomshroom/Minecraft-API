package net.minecraft.workbench;

import net.minecraft.workbench.server.Server;

/**
 * This class is extended and filled in by the API implementer. It will provide the required access
 */
public abstract class WorkbenchImpl {
    /**
     * Gets the name of this implementation of Workbench.
     *
     * @return Name of this implementation.
     */
    public abstract String getImplementationName();

    /**
     * Gets the version of this implementation of Workbench.
     *
     * @return Version of this implementation.
     */
    public abstract String getImplementationVersion();

    /**
     * Gets the {@link Server} currently being ran.
     *
     * @return Server object.
     */
    public abstract Server getServer();
}
