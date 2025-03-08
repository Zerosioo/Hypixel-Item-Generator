package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ASTRAEA extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Astraea";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ASTRAEA"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getDamage() {
        return 270;
    }

    @Override
    public int getDefense() {
        return 250;
    }

    @Override
    public int getTrueDefense() {
        return 20;
    }

    @Override
    public int getIntelligence() {
        return 50;
    }

}
