package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QUARTZ_BLOCK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Block of Quartz";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "QUARTZ_BLOCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.QUARTZ_BLOCK;
    }

    @Override
    public int getPrice() {
        return 16;
    }

}
