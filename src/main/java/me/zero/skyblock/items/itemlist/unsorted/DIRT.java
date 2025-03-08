package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIRT extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Dirt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIRT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIRT;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
