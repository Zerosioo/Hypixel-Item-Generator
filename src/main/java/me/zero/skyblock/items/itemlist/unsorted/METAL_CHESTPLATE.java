package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class METAL_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Metal Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "METAL_CHESTPLATE"; 
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
        return Color.fromRGB(217,217,217);
    }

    @Override
    public int getGearScore() {
        return 20;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getDefense() {
        return 230;
    }

}
