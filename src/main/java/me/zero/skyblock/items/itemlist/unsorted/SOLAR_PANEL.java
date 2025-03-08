package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SOLAR_PANEL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Solar Panel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SOLAR_PANEL"; 
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
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

}
