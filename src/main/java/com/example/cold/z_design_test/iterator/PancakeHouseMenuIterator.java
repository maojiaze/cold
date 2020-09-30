package com.example.cold.z_design_test.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.size() || items.get(position)==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem=items.get(position);
        position++;
        return menuItem;
    }
}
