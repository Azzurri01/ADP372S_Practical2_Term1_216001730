package com.cput.ac.za.com.cput.ac.za;
import javax.swing.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Application
{
    public static void main(String [] args)
    {
        Animal animal = new Animal();


        for(int i=0; i<3; i++)
        {
            String enterAnimal;
            enterAnimal=JOptionPane.showInputDialog(null, "Enter animal: ");
            animal.add(enterAnimal);
            animal.list.add(enterAnimal);
        }

        Collections.sort(animal.list);
        animal.Set();
        animal.Map();

    }
}
