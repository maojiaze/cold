package com.example.cold.z_design_test.iterator;

public class DinerMenuIterator implements Iterator{
    MenuItem[] items;
    int position=0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length || items[position]==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem=items[position];
        position++;
        return menuItem;
    }
}
