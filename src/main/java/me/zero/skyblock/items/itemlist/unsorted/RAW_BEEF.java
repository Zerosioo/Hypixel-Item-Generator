package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RAW_BEEF extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Raw Beef";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RAW_BEEF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RAW_BEEF;
    }

    @Override
    public int getPrice() {
        return 4;
    }

}
