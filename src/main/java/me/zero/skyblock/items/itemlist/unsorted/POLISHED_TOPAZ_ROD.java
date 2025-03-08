package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POLISHED_TOPAZ_ROD extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Polished Topaz Rod";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POLISHED_TOPAZ_ROD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FISHING_ROD;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getStrength() {
        return 100;
    }

    @Override
    public int getFishingSpeed() {
        return 40;
    }

}
