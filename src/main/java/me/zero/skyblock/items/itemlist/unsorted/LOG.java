package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LOG extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Oak Wood";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LOG"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LOG;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
