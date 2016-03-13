package com.parent;

import java.util.HashMap;

/**
 * Created by student on 2016/03/13.
 */
public class TheMap {

HashMap <Integer, Person > map ;


    public TheMap()
    {
        map = new HashMap<Integer , Person>();
    }

    public Person getFromPos(int position)
    {
        return map.get(position);
    }


    public void insertIntoPosZero(Person person)
    {

        map.put(0, person);
    }

    public void insertIntoPosOne(Person person)
    {
map.put(1,person);

    }

    public void insertIntoPosTWo(Person person)
    {

        map.put(2,person);
    }

}
