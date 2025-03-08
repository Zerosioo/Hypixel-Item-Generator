package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STONE_BRIDGE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Stone Platform";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STONE_BRIDGE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EGG;
    }

    @Override
    public int getPrice() {
        return 32;
    }

}
