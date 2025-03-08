package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUNGLE_WOOD_STAIRS extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Jungle Wood Stairs";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JUNGLE_WOOD_STAIRS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.JUNGLE_WOOD_STAIRS;
    }

    @Override
    public int getPrice() {
        return 0;
    }

}
