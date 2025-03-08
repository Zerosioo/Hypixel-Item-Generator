package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_SANDSTONE_2 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Red Smooth Sandstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_SANDSTONE:2"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RED_SANDSTONE;
    }

    @Override
    public byte getDurability() {
        return 2;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
