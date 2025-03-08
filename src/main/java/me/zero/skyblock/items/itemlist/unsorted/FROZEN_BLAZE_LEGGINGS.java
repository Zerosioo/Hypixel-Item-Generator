package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FROZEN_BLAZE_LEGGINGS extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Frozen Blaze Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FROZEN_BLAZE_LEGGINGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_LEGGINGS;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(160,218,239);
    }

    @Override
    public int getPrice() {
        return 806400;
    }

    @Override
    public int getDefense() {
        return 140;
    }

    @Override
    public int getSpeed() {
        return 2;
    }

}
