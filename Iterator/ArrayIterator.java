package designpattern.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayIterator implements Iterator
{
    Object [] items;
    int index;

    ArrayIterator(Object[] arr)
    {
        items = arr;
        index = 0;
    }


    @Override
    public boolean hasNext() {
        List<Integer> list = new ArrayList<Integer>();
        list.iterator();

        return (index+1 < items.length && items[index+1]!= null);
    }

    @Override
    public Object next() {
        try {
            return items[index+1];
        }
        catch (NoSuchElementException e)
        {
             return e;
        }

    }
}
