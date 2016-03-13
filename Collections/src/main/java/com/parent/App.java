package com.parent;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {

        TheList list = new TheList();
        Person person = new Person("Anita", 20);
        TheMap map = new TheMap();


        list.addElement(person);
        list.showList(person);

    }






}
