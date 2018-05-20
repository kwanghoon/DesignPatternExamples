package com.example.designpattern.composite;

import java.util.ArrayList;

public class Computer extends ComputerDevice {
    private ArrayList<ComputerDevice> components = new ArrayList<ComputerDevice>();

    public void addComponent(ComputerDevice component) { 
     components.add(component);
    }
    public void removeComponent(ComputerDevice component) { 
     components.remove(component);
    }

    public int getPrice() {
     int price = 0;
     for (ComputerDevice component : components)
        price += component.getPrice();
     return price; 
    }

    public int getPower() {
     int power = 0;
     for (ComputerDevice component : components)
        power += component.getPower();
     return power; 
    }
}
