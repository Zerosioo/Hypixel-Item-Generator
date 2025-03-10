package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACITE_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Glacite Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLACITE_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_CHESTPLATE;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(3,252,248);
    }

    @Override
    public int getPrice() {
        return 1750;
    }

    @Override
    public int getDefense() {
        return 150;
    }

    @Override
    public int getTrueDefense() {
        return 10;
    }

    @Override
    public int getSpeed() {
        return 15;
    }

    @Override
    public int getMiningSpeed() {
        return 10;
    }

}
