package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BRICK_STAIRS extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Brick Stairs";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BRICK_STAIRS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BRICK_STAIRS;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
