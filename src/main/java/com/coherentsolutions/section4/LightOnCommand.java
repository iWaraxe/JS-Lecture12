package com.coherentsolutions.section4;

// Concrete Command 1
public class LightOnCommand implements Command {
    public void execute() {
        System.out.println("Light is ON");
    }
}

