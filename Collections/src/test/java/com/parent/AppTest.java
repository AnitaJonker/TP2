package com.parent;

import org.junit.Assert;
import org.junit.Test;



public class AppTest
{
    @Test
    public void testApp()
    {
        Assert.assertTrue( true );
    }

    @Test
    public void testListSize()
    {
        TheList list = new TheList();
        Person person = new Person("Anita", 20);

        list.addElement(person);
        Assert.assertEquals(list.getSize(), 1);
    }

    @Test
    public void testMapPosZero()
    {
        Person person = new Person("Anita", 20);
        TheMap map = new TheMap();
        map.insertIntoPosZero(person);
        Assert.assertEquals(map.getFromPos(0).getName(),"Anita");
    }

    @Test
    public void testSet()
    {
        TheSet set = new TheSet();
        set.addToSet("Anita", "Igmar");

        Assert.assertEquals(set.getName(0), "Anita");
        Assert.assertEquals(set.getName(1), "Igmar");
    }


}
