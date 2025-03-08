package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_SANDSTONE_1 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Red Chiseled Sandstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_SANDSTONE:1"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RED_SANDSTONE;
    }

    @Override
    public byte getDurability() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
