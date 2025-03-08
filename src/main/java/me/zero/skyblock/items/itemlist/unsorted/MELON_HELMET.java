package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MELON_HELMET extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Melon Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MELON_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MELON_BLOCK;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getFarmingFortune() {
        return 15;
    }

}
