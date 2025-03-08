package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAY_SAVER extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Day Saver";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DAY_SAVER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DAYLIGHT_DETECTOR;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 35;
    }

}
