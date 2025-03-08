package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WOOD_PLATE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Wooden Pressure Plate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WOOD_PLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD_PLATE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
