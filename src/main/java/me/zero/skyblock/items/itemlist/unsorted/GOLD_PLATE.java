package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_PLATE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Light Weighted Pressure Plate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_PLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_PLATE;
    }

    @Override
    public int getPrice() {
        return 6;
    }

}
