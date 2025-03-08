package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MIDAS_STAFF extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Midas Staff";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MIDAS_STAFF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_SPADE;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getDamage() {
        return 130;
    }

    @Override
    public int getIntelligence() {
        return 50;
    }

}
