package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WATER_LILY extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Lily Pad";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WATER_LILY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WATER_LILY;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}
