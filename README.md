# Workbench
Workbench is the working name of the official Minecraft API, currently in very early stages of development. Its goal is to provide a means of allowing anyone to pick up Minecraft and easily achieve any goal from modifying gameplay to creating utilities to overhauling the clients graphics.

## Compilation
We're currently using Maven to compile the API, and here's how you can too!

* Install [Maven 3](http://maven.apache.org/download.html)
* Check out this repo and: `mvn clean install`

## Running
By itself the API will do nothing. It must be implemented by a third party to work. Minecraft itself will be the official implementation of this API. At time of writing, there are no implementations to use yet (but also, there's not much really to implement).

## Discussion
The official IRC channels for the API are located on [irc.esper.net at #minecraftdev and #minecraftdev-discuss](http://webchat.esper.net/?nick=&channels=minecraftdev%2Cminecraftdev-discuss). You may also follow us on twitter for commit updates at [@MinecraftAPIBot](http://twitter.com/MinecraftAPIBot).

## Coding Standards
* Javadocs are vital and must be used for every public facing method. They must note any possible raised exception, the return result (if any), the method arguments (if any) and a description of the method - this is a minimum, more is better.
* All public facing methods must be input validated and raise exceptions if something is wrong. It's better to catch a bug that may happen than let it grow into something worse.
* No tabs, use 4 space indents. No trailing whitespaces. Use sun/oracle coding standards if in doubt.
* Where possible, use tests. Lots of them.
* Absolutely no already-implemented classes. Use interfaces, and have util classes created by a implementation-controlled Factory.
* Give users the ability to do something directly rather than indirectly. It's better to have a concrete way of doing X than to have a roundabout way of doing X for now which may not work later.