package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HORSEMAN_SCYTHE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Horseman's Scythe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HORSEMAN_SCYTHE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_HOE;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getDamage() {
        return 100;
    }

}
