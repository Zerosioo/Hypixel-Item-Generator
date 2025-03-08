package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOOKSHELF extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Bookshelf";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOOKSHELF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOOKSHELF;
    }

    @Override
    public int getPrice() {
        return 20;
    }

}
