package com.parent;

import java.util.ArrayList;

/**
 * Created by student on 2016/03/13.
 */
public class TheList {

    private ArrayList <Person> list;

    public TheList()
    {
        list = new ArrayList <Person>();
    }

    public void addElement(Person person)
    {
        list.add(person);
    }

    public void removeElement(Person person)
    {
        list.remove(person);
    }

    public void showList(Person person)
    {
        for (Person temp : list){
            System.out.println(temp.toString());
        }


    }


    public int getSize()
    {
        return list.size();
    }



}
