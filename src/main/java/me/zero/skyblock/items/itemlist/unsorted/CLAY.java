package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLAY extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Clay";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CLAY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CLAY;
    }

    @Override
    public int getPrice() {
        return 12;
    }

}
