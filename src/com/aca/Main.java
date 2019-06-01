package com.aca;


import com.aca.ui.CommandLineUserInterface;

public class Main {

    public static void main(String[] args) {
        SuperCollection<Integer> superCollection = new SuperCollection<>();
        CommandLineUserInterface commandLineUserInterface = new CommandLineUserInterface();
        superCollection.add(111);
        commandLineUserInterface.output(superCollection.toString());
    }
}
