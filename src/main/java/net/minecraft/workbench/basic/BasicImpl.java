package net.minecraft.workbench.basic;

import java.util.ArrayList;

import net.minecraft.workbench.WorkbenchImpl;
import net.minecraft.workbench.basic.server.BasicServer;
import net.minecraft.workbench.event.Event;
import net.minecraft.workbench.event.EventHandler;
import net.minecraft.workbench.server.Server;

public class BasicImpl extends WorkbenchImpl{

	Server server= new BasicServer();
	ArrayList<EventHandler> eventHandlers=new ArrayList<EventHandler>();
	
	@Override
	public String getImplementationName() {
		return "Basic";
	}

	@Override
	public String getImplementationVersion() {
		return "1.0";
	}

	@Override
	public Server getServer() {
		return server;
	}

	@Override
	public void callEvent(Event event) {
		for(EventHandler handler:eventHandlers){
			handler.receiveEvent(event);
		}
	}

	@Override
	public void registerEventHandler(EventHandler handler) {
		eventHandlers.add(handler);
	}

}
