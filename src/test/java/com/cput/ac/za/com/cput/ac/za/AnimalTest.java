package com.cput.ac.za.com.cput.ac.za;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    ApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigClass.class);
    AnimalInterface aInterface = (AnimalInterface) appContext.getBean("Alias");

    @Test
    public void add()
    {
        Animal animal = new Animal();
        for(int i=0; i<animal.list.size(); i++)
        {
            String result = aInterface.add(animal.list.get(i));
            Assert.assertEquals("?????", result);
        }
    }

    @Test
    public void set()
    {
        Animal animal = new Animal();
        for(int i=0; i<animal.list.size(); i++)
        {
            String result = aInterface.add(animal.list.get(i));
            Assert.assertEquals("?????", result);
        }
    }

    @Test
    public void map()
    {
        Animal animal = new Animal();
        for(int i=0; i<animal.list.size(); i++)
        {
            String result = aInterface.add(animal.list.get(i));
            Assert.assertEquals("?????", result);
        }
    }
}