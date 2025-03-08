package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COBBLE_WALL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Cobblestone Wall";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COBBLE_WALL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COBBLE_WALL;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
