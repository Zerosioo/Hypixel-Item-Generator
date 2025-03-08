package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ELLES_LAVA_ROD extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Elle's Lava Rod";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ELLES_LAVA_ROD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FISHING_ROD;
    }

    @Override
    public Tier getTier() {
        return Tier.SPECIAL;
    }

    @Override
    public int getStrength() {
        return 50;
    }

    @Override
    public int getFishingSpeed() {
        return 8;
    }

}
