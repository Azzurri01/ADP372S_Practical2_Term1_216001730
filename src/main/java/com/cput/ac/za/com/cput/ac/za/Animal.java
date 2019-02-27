package com.cput.ac.za.com.cput.ac.za;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;


public class Animal
{
    public String add(String animal)
    {
        return animal;
    }

    public ArrayList<String> list = new ArrayList<>();

    public void Set()
    {
        Set set = new HashSet();
        for(int i=0; i<list.size(); i++)
        {
            set.add(list.get(i));
        }
        System.out.println("Print list in set: " + set.toString());
    }


    public void Map()
    {
        Map map = new HashMap<>();
        for(int i=0; i<list.size(); i++)
        {
            map.put("key"+i, list.get(i));
        }
        System.out.println("Print list in map: " + map.toString());
    }

}
