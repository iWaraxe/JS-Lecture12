package com.coherentsolutions.section4;

// CommandPatternExample.java

public class CommandPatternExample {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // Using LightOnCommand
        remote.setCommand(new LightOnCommand());
        remote.pressButton();

        // Using LightOffCommand
        remote.setCommand(new LightOffCommand());
        remote.pressButton();
    }
}



