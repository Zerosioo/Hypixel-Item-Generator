package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOW_BLOCK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Snow Block";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOW_BLOCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SNOW_BLOCK;
    }

    @Override
    public int getPrice() {
        return 4;
    }

}
