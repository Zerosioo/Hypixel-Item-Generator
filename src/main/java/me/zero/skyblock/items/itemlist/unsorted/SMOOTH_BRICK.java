package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SMOOTH_BRICK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Stone Bricks";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SMOOTH_BRICK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SMOOTH_BRICK;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
