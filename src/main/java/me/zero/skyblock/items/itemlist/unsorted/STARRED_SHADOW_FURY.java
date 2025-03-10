package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARRED_SHADOW_FURY extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Shadow Fury";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARRED_SHADOW_FURY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getGearScore() {
        return 100;
    }

    @Override
    public int getPrice() {
        return 500000;
    }

    @Override
    public int getDamage() {
        return 310;
    }

    @Override
    public int getCritDamage() {
        return 60;
    }

    @Override
    public int getSpeed() {
        return 40;
    }

}
