package com.parent;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by student on 2016/03/13.
 */
public class TheSet {

    Set setA;
    private Iterator <String> iterator;

    public TheSet()
    {
        setA = new HashSet();
    }

    public void addToSet(String name , String name2)
    {
        setA.add(name);
        setA.add(name2);

    }



    public void displaySet()
    {
        System.out.println(setA);
    }

    public String getName(int size)
    {
        iterator = setA.iterator();
        for(int i = 0; i< size ;i++) {
            System.out.println(iterator.next());
        }
        return iterator.next();
    }


}
