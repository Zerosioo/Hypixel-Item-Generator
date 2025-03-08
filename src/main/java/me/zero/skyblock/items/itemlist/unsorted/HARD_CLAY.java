package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HARD_CLAY extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Hardened Clay";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HARD_CLAY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.HARD_CLAY;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
